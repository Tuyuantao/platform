package com.ticketnew.qe.api.trade;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ticketnew.qe.api.csb.CsbResponse;
import com.ticketnew.qe.api.entity.Order;
import com.ticketnew.qe.api.entity.Promotion;
import com.ticketnew.qe.api.entity.UserProfile;
import com.ticketnew.qe.api.order.OrderAPI;
import com.ticketnew.qe.api.order.OrderStatusEnum;
import com.ticketnew.qe.api.promotion.PromotionUtil;
import com.ticketnew.qe.api.seat.SeatUtil;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/5/26
 */
public class TradeUtil {

    private static String payId = "35003738";
    private static String ticketCode = "AAWCXPUM";
    private static String confirmCode = "35003738/35003738";

    public static Order getTradeInfo(String sessionId, String lockId) {
        CsbResponse csbResponse = new TradeAPI.Builder().sessionId(sessionId).lockId(lockId).getConfirmOrderDetail();
        if (csbResponse.isValid()) {
            Gson gson = new Gson();
            Order order = gson.fromJson(csbResponse.getBody().getData().toString(), new TypeToken<Order>() {
            }.getType());
            return order;
        }
        return null;
    }

    public static List<Order> getOrders(String sessionId, Integer pageSize, String status) {
        CsbResponse csbResponse = new OrderAPI.Builder().sessionId(sessionId).status(Optional.ofNullable(status))
            .pageSize(pageSize).getOrders();
        if (csbResponse.isValid()) {
            Gson gson = new Gson();
            List<Order> orders = gson.fromJson(csbResponse.getBody().getData().toString(), new TypeToken<List<Order>>() {
            }.getType());

            return orders;
        }

        return null;
    }

    public static Map<String, Integer> getOrderCountByStatus(String sessionId, String status) {
        Map<String, Integer> map = new HashMap<>();
        CsbResponse csbResponse = new OrderAPI.Builder().sessionId(sessionId).status(status).getOrderCount();
        if (csbResponse.isValid()) {
            int number = csbResponse.getBody().get("data.length()");
            if (number <= 0) {
                return map;
            }

            for (int i = 0; i < number; i++) {
                status = csbResponse.getBody().get("data[" + i + "].status");
                int count = csbResponse.getBody().get("data[" + i + "].count");
                map.put(status, count);
            }
            return map;
        }

        return null;
    }

    public static Order generateIssueOrder(UserProfile userProfile, long scheduleId, String areaId, int lockCount,
                                           String promotionCode) {
        return generateOrder(userProfile, scheduleId, areaId, lockCount, PayOrderStatusEnum.ISSUE_SUCCESS.name(),
            promotionCode);
    }

    public static Order generatePendingOrder(UserProfile userProfile, long scheduleId, String areaId, int lockCount,
                                             String promotionCode) {
        return generateOrder(userProfile, scheduleId, areaId, lockCount, PayOrderStatusEnum.ISSUE_FAIL.name(),
            promotionCode);
    }

    public static Order generateUnpaidOrder(UserProfile userProfile, long scheduleId, String areaId, int lockCount,
                                            String promotionCode) {
        return generateOrder(userProfile, scheduleId, areaId, lockCount, TradeStatusEnum.UNPAY.name(), promotionCode);
    }

    public static Order generateOrder(UserProfile userProfile, long scheduleId, String areaId, int lockCount,
                                      String status, String promotionCode) {
        Promotion promotion = null;
        int amount;
        String lockId = SeatUtil.buildLockIdByManual(userProfile.getSession(), scheduleId, areaId, lockCount);
        Order order = TradeUtil.getTradeInfo(userProfile.getSession(), lockId);
        amount = order.getAmount();
        if (promotionCode != null) {
            promotion = PromotionUtil.isValid(userProfile, lockId, promotionCode);
            if (promotion == null) {
                return null;
            }
        }

        if (promotion != null) {
            amount = amount - promotion.getAmount();
        }

        order = addOrder(userProfile, lockId, amount, order.getDonation().getAmount(), promotionCode, true);

        if (null != order) {
            return payOrder(userProfile, order, status);
        }

        return null;
    }

    public static boolean closeOrder(String sessionId, String tradeId) {
        CsbResponse csbResponse = new TradeAPI.Builder()
            .sessionId(sessionId)
            .tradeId(tradeId)
            .closeOrder();

        if (csbResponse.isValid()) {
            return TradeStatusEnum.UNPAY.name().equalsIgnoreCase(csbResponse.getBody().get("data.payStatus"));
        }

        return false;
    }

    public static boolean refundOrder(String sessionId, String tradeId) {
        CsbResponse csbResponse = new TradeAPI.Builder()
            .sessionId(sessionId)
            .tradeId(tradeId)
            .refundOrder();

        if (csbResponse.isValid()) {
            return csbResponse.getBody().get("data.result");
        }

        return false;
    }

    public static Order addOrder(UserProfile userProfile, String lockId, int amount, int donationAmount,
                                 String promotionCode, boolean modifyUser) {
        CsbResponse csbResponse = new TradeAPI.Builder()
            .sessionId(userProfile.getSession())
            .lockId(lockId)
            .donationAmount(donationAmount)
            .promotionCode(Optional.ofNullable(promotionCode))
            .modifyUser(modifyUser)
            .amount(amount)
            .addOrder();

        if (csbResponse.isValid()) {
            Gson gson = new Gson();
            Order order = gson.fromJson(csbResponse.getBody().getData().toString(), new TypeToken<Order>() {
            }.getType());
            return order;
        }

        return null;
    }

    public static Order payOrder(UserProfile userProfile, Order order, String status) {
        order.setStatus(status);
        if (status.equalsIgnoreCase(OrderStatusEnum.UNPAID.name())) {
            return order;
        } else if (status.equalsIgnoreCase(OrderStatusEnum.UPCOMING.name())) {
            CsbResponse csbResponse = new TradeAPI.Builder().tradeId(order.getTradeId())
                .userId(userProfile.getUserId())
                .payId(payId)
                .ticketCode(ticketCode)
                .confirmCode(confirmCode)
                .status(status).payOrder();

            if (csbResponse.isValid() && Boolean.valueOf((boolean)csbResponse.getBody().get("data.result"))) {
                return order;
            }
        } else if (status.equalsIgnoreCase(OrderStatusEnum.PENDING.name())) {
            CsbResponse csbResponse = new TradeAPI.Builder().tradeId(order.getTradeId())
                .userId(userProfile.getUserId())
                .payId(payId)
                .ticketCode("")
                .confirmCode(confirmCode)
                .status(status).payOrder();
            if (csbResponse.isValid() && Boolean.valueOf((boolean)csbResponse.getBody().get("data.result"))) {
                return order;
            }
        }else if (status.equalsIgnoreCase(OrderStatusEnum.REFUND.name())) {
            CsbResponse csbResponse = new TradeAPI.Builder().tradeId(order.getTradeId())
                .userId(userProfile.getUserId())
                .payId(payId)
                .ticketCode("")
                .confirmCode(confirmCode)
                .status(status).payOrder();
            if (csbResponse.isValid() && Boolean.valueOf((boolean)csbResponse.getBody().get("data.result"))) {
                refundOrder(userProfile.getSession(),order.getTradeId());
                return order;
            }
        }

        return null;

    }
}
