package com.ticketnew.qe.api.trade;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.ticketnew.qe.api.BasicAPI;
import com.ticketnew.qe.api.csb.CsbResponse;
import com.ticketnew.qe.api.csb.HttpRequestUtil;
import org.inferred.freebuilder.FreeBuilder;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/5/2
 */
@FreeBuilder
public interface TradeAPI extends BasicAPI {

    Optional<String> sessionId();

    Optional<String> lockId();

    Optional<String> fbs();

    Optional<String> promotionCode();

    Optional<Integer> donationAmount();

    Optional<Boolean> modifyUser();

    Optional<Integer> amount();

    Optional<String> tradeId();

    Optional<Long> scheduleId();

    Optional<Long> areaId();

    Optional<String> seats();

    Optional<Long> pgId();

    Optional<Long> transId();

    Optional<String> dataPickUpCode();

    Optional<String> merchantAppData();

    Optional<String> merchantTxnId();

    Optional<String> messageHash();

    Optional<String> refTxnId();

    Optional<String> responseCode();

    Optional<String> responseDescription();

    Optional<String> userId();

    Optional<String> confirmCode();

    Optional<String> payId();

    Optional<String> status();

    Optional<String> ticketCode();

    enum TradeAPIEnum {
        CONFIRM_ORDER_DETAIL("CONFIRM_ORDER_DETAIL", "ticketnew.app.trade.getConfirmOrderDetail"),
        ADD_ORDER("ADD_ORDER", "ticketnew.app.trade.addOrder"),
        REISSUE_ORDER("REISSUE_ORDER", "ticketnew.app.trade.reissueOrder"),
        REISSUE_PENDING_ORDER("REISSUE_PENDING_ORDER", "ticketnew.app.trade.reissuePendingOrder"),
        REFUND_PENDING_ORDER("REFUND_PENDING_ORDER", "ticketnew.app.trade.refundPendingOrder"),
        REFUND_ORDER("REFUND_ORDER", "ticketnew.app.trade.refundOrder"),
        CLOSE_ORDER("CLOSE_ORDER", "ticketnew.app.trade.closeOrder"),
        PAY_ZAPP_INIT("PAY_ZAPP_INIT", "ticketnew.app.trade.payZappInit"),
        PAY_ZAPP_COMMIT("PAY_ZAPP_COMMIT", "ticketnew.app.trade.payZappCommit"),
        CONFIRM_PENDING_ORDER("CONFIRM_PENDING_ORDER", "ticketnew.app.trade.confirmPendingOrder"),
        PAY_ORDER("PAY_ORDER", "ticketnew.server.trade.payOrder"),;

        private String tradeType;
        private String apiName;

        TradeAPIEnum(String tradeType, String apiName) {
            this.tradeType = tradeType;
            this.apiName = apiName;
        }

        public String getApiName() {
            return this.apiName;
        }

        public String getTradeType() {
            return this.tradeType;
        }

    }

    class Builder extends TradeAPI_Builder {
        private Map<String, String> params = new HashMap<>();
        private String api = null;
        private HttpRequestUtil httpRequestUtil = new HttpRequestUtil();

        public CsbResponse getConfirmOrderDetail() {
            api = TradeAPIEnum.CONFIRM_ORDER_DETAIL.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse addOrder() {
            api = TradeAPIEnum.ADD_ORDER.getApiName();
            addParams();
            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse reissueOrder() {
            api = TradeAPIEnum.REISSUE_ORDER.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse reissuePendingOrder() {
            api = TradeAPIEnum.REISSUE_PENDING_ORDER.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse refundPendingOrder() {
            api = TradeAPIEnum.REFUND_PENDING_ORDER.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse refundOrder() {
            api = TradeAPIEnum.REFUND_ORDER.getApiName();
            addParams();
            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse closeOrder() {
            api = TradeAPIEnum.CLOSE_ORDER.getApiName();
            addParams();
            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse confirmPendingOrder() {
            api = TradeAPIEnum.CONFIRM_PENDING_ORDER.getApiName();
            addParams();
            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse payZappInit() {
            api = TradeAPIEnum.PAY_ZAPP_INIT.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse payZappCommit() {
            api = TradeAPIEnum.PAY_ZAPP_COMMIT.getApiName();
            addParams();
            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse payOrder() {
            api = TradeAPIEnum.PAY_ORDER.getApiName();
            addParams();
            return httpRequestUtil.doPost(api, params);
        }

        public void addParams() {
            if (sessionId().isPresent()) {
                params.put("sessionId", sessionId().get());
            }

            if (lockId().isPresent()) {
                params.put("lockId", lockId().get());
            }

            if (fbs().isPresent()) {
                params.put("fbs", fbs().get());
            }

            if (promotionCode().isPresent()) {
                params.put("promotionCode", promotionCode().get());
            }

            if (donationAmount().isPresent()) {
                params.put("donationAmount", String.valueOf(donationAmount().get()));
            }

            if (modifyUser().isPresent()) {
                params.put("modifyUser", String.valueOf(modifyUser().get()));
            }

            if (amount().isPresent()) {
                params.put("amount", String.valueOf(amount().get()));
            }

            if (tradeId().isPresent()) {
                params.put("tradeId", tradeId().get());
            }

            if (scheduleId().isPresent()) {
                params.put("scheduleId", String.valueOf(scheduleId().get()));
            }

            if (areaId().isPresent()) {
                params.put("areaId", String.valueOf(areaId().get()));
            }

            if (seats().isPresent()) {
                params.put("seats", seats().get());
            }

            if (pgId().isPresent()) {
                params.put("pgId", String.valueOf(pgId().get()));
            }

            if (transId().isPresent()) {
                params.put("transId", String.valueOf(transId().get()));
            }

            if (dataPickUpCode().isPresent()) {
                params.put("dataPickUpCode", dataPickUpCode().get());
            }

            if (merchantAppData().isPresent()) {
                params.put("merchantAppData", merchantAppData().get());
            }

            if (merchantTxnId().isPresent()) {
                params.put("merchantTxnId", merchantTxnId().get());
            }

            if (messageHash().isPresent()) {
                params.put("messageHash", messageHash().get());
            }

            if (refTxnId().isPresent()) {
                params.put("refTxnId", refTxnId().get());
            }

            if (responseCode().isPresent()) {
                params.put("responseCode", responseCode().get());
            }

            if (responseDescription().isPresent()) {
                params.put("responseDescription", responseDescription().get());
            }

            if (userId().isPresent()) {
                params.put("userId", userId().get());
            }

            if (confirmCode().isPresent()) {
                params.put("confirmCode", confirmCode().get());
            }

            if (payId().isPresent()) {
                params.put("payId", payId().get());
            }

            if (status().isPresent()) {
                params.put("status", status().get());
            }

            if (ticketCode().isPresent()) {
                params.put("ticketCode", ticketCode().get());
            }

            if (appPlatform().isPresent()) {
                params.put("appPlatform", appPlatform().get());
            }

            if (appChannel().isPresent()) {
                params.put("appChannel", appChannel().get());
            }

            if (appVersion().isPresent()) {
                params.put("appVersion", appVersion().get());
            }

            if (appDevice().isPresent()) {
                params.put("appDevice", appDevice().get());
            }

            if (appEnv().isPresent()) {
                params.put("appEnv", appEnv().get());
            }
        }
    }
}
