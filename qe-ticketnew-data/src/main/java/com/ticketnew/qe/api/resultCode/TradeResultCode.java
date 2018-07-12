package com.ticketnew.qe.api.resultCode;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/16
 */
public enum TradeResultCode implements ResultCode {

    /**
     * trade
     */
    /**
     * code:40001
     */
    TRADE_ORDER_NOT_EXIST("40001", "Oops, something wrong happened"),
    /**
     * code:40002
     */
    TRADE_LOCK_SEAT_EXPIRE("40002", "Time out, Please go back to select seat again"),
    /**
     * code:40003
     */
    TRADE_SCHEDULE_EXPIRE("40003", "Show closed"),
    /**
     * code:40004
     */
    TRADE_ORDER_AMOUNT_ERROR("40004", "Oops, something wrong happened"),
    /**
     * code:40005
     */
    TRADE_ORDER_STATUS_ERROR("40005", "Order status is not correct"),
    /**
     * code:40006
     */
    TRADE_RESELECT_SEAT_NOT_SAME("40006", "You should choose same showtime, seat level and number with your pending order"),
    /**
     * code:40007
     */
    TRADE_PAY_TRADE_FORMAT_ERROR("40007", "trade format error"),
    /**
     * code:40008
     */
    TRADE_STATUS_ERROR("40008", "Oops, something wrong happened"),
    /**
     * code:40009
     */
    TRADE_CAN_NOT_REFUND("40009", "trade can not be refunded"),
    /**
     * code:40010
     */
    TRADE_LOCK_SEAT_FAIL("40010", "Oops, something wrong happened"),
    /**
     * code:40011
     */
    TRADE_UNLOCK_SEAT_FAIL("40011", "Oops, something wrong happened"),
    /**
     * code:40012
     */
    TRADE_PAY_STATUS_NOT_EXIST("40012", "Oops, something wrong happened"),
    /**
     * code:40013
     */
    TRADE_ADD_ORDER_ERROR("40013", "Oops, something wrong happened"),
    /**
     * code:40014
     */
    TRADE_AUTO_LOCK_SEAT_FAIL("40014", "Auto Locked seat fail, please try again later"),
    /**
     * code:40015
     */
    TRADE_CONFIRM_ORDER_EXPIRE("40015", "Order has been expired, please refresh the page"),
    /**
     * code:40016
     */
    TRADE_CONFIRM_ORDER_ERROR("40016", "Confirm order failed, please try again later"),
    /**
     * code:40017
     */
    TRADE_CONFIRM_SEAT_NOT_AVAILABLE("40017", "The requested seat(s) not available. Please choose %s %s seat(s) again"),
    /**
     * code:40018
     */
    TRADE_CONFIRM_ALL_SEATS_NOT_AVAILABLE("40018", "Seat of %s sold out"),
    /**
     * code:40019
     */
    TRADE_PENDING_ORDER_EXIST("40019", "Please confirm your pending order before booking a new order"),
    /**
     * code:40020
     */
    TRADE_LOCK_SEAT_NOT_AVAILABLE("40020", "Seat(s) you selected are not available, please choose other seat(s)"),
    /**
     * code:40021
     */
    TRADE_LOCK_AUTO_SEAT_NOT_AVAILABLE("40021", "There are not enough seats, please change a showtime"),
    /**
     * code:40022
     */
    TRADE_LOCK_AUTO_SEAT_INVALID_SEAT_COUNT("40022", "You should choose at least %s seat(s)"),
    /**
     * code:40023
     */
    TRADE_LOCK_AUTO_SEAT_NOT_EXIST("40023", "Oops, something wrong happened"),
    /**
     * code:40024
     */
    TRADE_LOCK_SEAT_INVALID_SEAT_COUNT("40024", "Oops, something wrong happened"),
    /**
     * code:40025
     */
    TRADE_LOCK_SEAT_ONLY_USER_MODE("40025", "Can only lock seat by user"),
    /**
     * code:40026
     */
    TRADE_LOCK_SEAT_ONLY_SYSTEM_MODE("40026", "Can not lock seat by user"),
    /**
     * code:40027
     */
    TRADE_REFUND_FAIL("40027", "Oops, something wrong happened"),
    /**
     * code:40028
     */
    TRADE_CAN_NOT_CLOSE("40028", "Trade can not be closed"),
    /**
     * code:40029
     */
    TRADE_CLOSE_ERROR("40029", "Trade close error, please try again later"),
    ;

    TradeResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;

    private String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
