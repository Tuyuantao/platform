package com.ticketnew.qe.api.trade;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/7
 */
public enum  TradeStatusEnum {

    /**
     * user doesn't pay money
     */
    UNPAY,
    PAYED,
    /**
     * user already pay money and buy ticket successfully
     */
    ISSUED,
    /**
     * this trade is failed, maybe user close this order
     */
    FAILED,
    /**
     * user pay money, but doesn't get tickets : like pending status
     */
    ISSUE_FAILED,
    /**
     * user pay money, but doesn't get tickets. so user refund this ticket
     */
    REFUND,
    ;

    public static TradeStatusEnum getTradeStatus(String statusStr) {
        try {
            if (statusStr !=null) {
                return TradeStatusEnum.valueOf(statusStr);
            }
        } catch (Exception e) {
        }
        return null;
    }
}
