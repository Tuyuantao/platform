package com.ticketnew.qe.api.resultCode;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/16
 */
public enum BannerResultCode implements ResultCode {

    /**
     * Banner
     */
    /**
     * code:60000
     */
    BANNER__SYSTEM_ERROR("60000", "System busy, please try again later"),
    /**
     * code:60001
     */
    BANNER_REGION_ID_EMPTY("60001", "Banner region id cant be null"),
    ;

    BannerResultCode(String code, String message) {
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
