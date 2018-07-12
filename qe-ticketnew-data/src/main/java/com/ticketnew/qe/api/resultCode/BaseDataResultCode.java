package com.ticketnew.qe.api.resultCode;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/16
 */
public enum BaseDataResultCode implements ResultCode {

    /**
     * basedata
     */
    /**
     * code:20001
     */
    BASEDATA_SCHEDULE_NOT_EXIST("20001", "Oops, something wrong happened"),
    /**
     * code:20002
     */
    BASEDATA_SEAT_MAP_EMPTY("20002", "Oops, something wrong happened"),
    /**
     * code:20003
     */
    BASEDATA_SOLD_SEAT_EMPTY("20003", "Oops, something wrong happened"),
    /**
     * code:20004
     */
    BASEDATA_SCHEDULE_PRICE_EMPTY("20004", "Oops, something wrong happened"),
    /**
     * code:20005
     */
    BASEDATA_SCHEDULE_SOLD_PRICE_NOT_EQUAL("20005", "Oops, something wrong happened"),
    /**
     * code:20006
     */
    BASEDATA_LOCK_SEAT_EMPTY("20006", "Oops, something wrong happened"),
    /**
     * code:20007
     */
    BASEDATA_REGION_ID_NULL("20007", "Region id can not be null"),
    /**
     * code:20008
     */
    BASEDATA_SEARCH_MOVIE_MOVIE_NAME_NULL("20008", "Movie name can not be null"),
    /**
     * code:20009
     */
    BASEDATA_MOVIE_ID_NULL("20009", "Movie id can not be null"),
    /**
     * code:20010
     */
    BASEDATA_PLATFORM_ERROR("20010", "Oops, something wrong happened"),
    /**
     * code:20011
     */
    BASEDATA_CINEMA_ID_NULL("20011", "Cinema id can not be null"),
    /**
     * code:20012
     */
    BASEDATA_LOCATION_PARAMS_INVALID("20012", "location parameters invalid"),
    /**
     * code:20013
     */
    BASEDATA_LOCATION_FAIL("20013", "location fail, can't get city by params"),
    /**
     * code:20014
     */
    BASEDATA_LOCK_COUNT_NULL("20014", "auto lock count not be null");

    BaseDataResultCode(String code, String message) {
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
