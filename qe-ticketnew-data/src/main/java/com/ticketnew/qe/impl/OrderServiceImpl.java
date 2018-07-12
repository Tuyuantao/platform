package com.ticketnew.qe.impl;

import java.util.Objects;

import com.ticketnew.qe.api.account.AccountUtil;
import com.ticketnew.qe.api.entity.Order;
import com.ticketnew.qe.api.entity.UserProfile;
import com.ticketnew.qe.api.trade.TradeUtil;
import com.ticketnew.qe.exceptions.ParamIsRequiredException;
import com.ticketnew.qe.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/19
 */

public class OrderServiceImpl implements OrderService {

    private final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
    /**
     * generate order
     */
    @Override
    public Order generateOrder(String mobile, String scheduleId, String areaId, String lockSeatCount,
                                String promotionCode, String orderStatus) {
        checkParams(mobile, scheduleId, areaId, lockSeatCount);
        UserProfile userProfile = AccountUtil.getUserProfileByMobile(mobile);
        Order order = TradeUtil.generateOrder(userProfile, Long.valueOf(scheduleId), areaId,
            Integer.valueOf(lockSeatCount), orderStatus, promotionCode);
        logger.info(order.toString());
        return order;
    }

    /**
     *
     * @param mobile
     * @param scheduleId
     * @param areaId
     * @param lockSeatCount
     */
    private void checkParams(String mobile, String scheduleId, String areaId, String lockSeatCount) {

        if (Objects.isNull(mobile)) {
            throw new ParamIsRequiredException("mobile is required");
        }

        if (Objects.isNull(scheduleId)) {
            throw new ParamIsRequiredException("scheduleId is required");
        }

        if (Objects.isNull(areaId)) {
            throw new ParamIsRequiredException("areaId is required");
        }

        if (Objects.isNull(lockSeatCount)) {
            throw new ParamIsRequiredException("lockSeatCount is required");
        }

    }
}
