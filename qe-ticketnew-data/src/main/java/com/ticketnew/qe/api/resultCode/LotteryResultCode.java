package com.ticketnew.qe.api.resultCode;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/16
 */
public enum LotteryResultCode implements ResultCode {
    /**
     * LotteryRequestWithoutLogin
     */
    LOTTERY_DRAW_FAIL("70000", "Oops, something wrong happened"),
    LOTTERY_DRAW_PARAM_EMPTY("70001", "Oops, something wrong happened"),
    LOTTERY_DRAW_CHANGES_RUN_OUT("70002", "You cannot avail this lottery, not enough chances"),
    LOTTERY_NOT_EXIST("70003", "Lottery not exist"),
    ;

    LotteryResultCode(String code, String message) {
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
