package com.ticketnew.qe.api.resultCode;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/16
 */
public enum PromotionResultCode implements ResultCode {

    /**
     * promotion
     */
    /**
     * code:50000
     */
    PROMOTION_SYSTEM_ERROR("50000", "System busy, please try again later"),
    /**
     * code:50001
     */
    PROMOTION_NOT_START("50001", "Promotion start from %s"),
    /**
     * code:50002
     */
    PROMOTION_COUPON_CODE_EMPTY("50002", "Promotion code invalid"),
    /**
     * code:50003
     */
    PROMOTION_USER_INPUT_LIMITATION("50003", "You already tried 10 times in 60 seconds, wait for 60 seconds"),
    /**
     * code:50004
     */
    PROMOTION_OVER("50004", "Promotion end by %s"),
    /**
     * code:50005
     */
    PROMOTION_NOT_EXIST("50005", "Promotion code invalid"),
    /**
     * code:50006
     */
    PROMOTION_QUALIFICATION_NOT_EXISTS("50006", "You are not eligible to avail this offer."),
    /**
     * code:50007
     */
    PROMOTION_ADD_FAIL("50007", "Oops, something wrong happened"),
    /**
     * code:50008
     */
    PROMOTION_TIME_ERROR("50008", "Today is not eligible to avail this offer"),
    /**
     * code:50009
     */
    PROMOTION_SCHEDULE_TIME_ERROR("50009", "Your showtime is not eligible to avail this offer"),
    /**
     * code:50010
     */
    PROMOTION_SCHEDULE_DATE_EMPTY("50010", "Oops, something wrong happened"),
    /**
     * code:50011
     */
    PROMOTION_QUALIFICATION_RUN_OUT("50011", "Maximum limit for the offer has been reached. Check the offer terms for eligibility."),
    /**
     * code:50012
     */
    PROMOTION_PARAM_ERROR("50012", "Oops, something wrong happened"),
    /**
     * code:50013
     */
    PROMOTION_QUALIFICATION_ALGORITHM_EMPTY("50013", "Oops, something wrong happened"),
    /**
     * code:50014
     */
    PROMOTION_QUALIFICATION_NOT_REACH_MINIMUM_TICKET_THRESHOLD("50014", "You have to chose at least %s tickets to avail this offer"),
    /**
     * code:50015
     */
    PROMOTION_QUALIFICATION_NOT_REACH_MINIMUM_GRAND_TOTAL("50015", "You have to get order amount at least %s to avail this offer"),
    /**
     * code:50016
     */
    PROMOTION_QUALIFICATION_OVER_MAXIMUM_TIMES("50016", "You can only avail this offer %s times"),
    /**
     * code:50017
     */
    PROMOTION_QUALIFICATION_CINEMA_NOT_MATCH("50017", "%s cannot avail this offer"),
    /**
     * code:50018
     */
    PROMOTION_QUALIFICATION_REGION_NOT_MATCH("50018", "%s cannot avail this offer"),
    /**
     * code:50019
     */
    PROMOTION_QUALIFICATION_MOVIE_NOT_MATCH("50019", "%s cannot avail this offer"),
    /**
     * code:50020
     */
    PROMOTION_QUALIFICATION_USER_GROUP_NOT_MATCH("50020", "You are not eligible to avail this offer"),
    /**
     * code:50021
     */
    PROMOTION_QUALIFICATION_USER_TAG_INVALID("50021", "You are not eligible to avail this offer"),
    /**
     * code:50022
     */
    PROMOTION_QUALIFICATION_VERSION_NOT_INCLUDE("50022", "Only %s can avail this offer"),
    /**
     * code:50023
     */
    PROMOTION_QUALIFICATION_PLATFORM_NOT_INCLUDE("50023", "Only %s can avail this offer"),
    /**
     * code:50024
     */
    PROMOTION_QUALIFICATION_CHANNEL_NOT_INCLUDE("50024", "Only %s can avail this offer"),
    /**
     * code:50025
     */
    PROMOTION_INITIATE_CACHE_FAIL("50025", "Oops, something wrong happened"),
    /**
     * code:50026
     */
    PROMOTION_LOCK_PROMOTION_FAIL("50026", "Oops, something wrong happened"),
    /**
     * code:50027
     */
    PROMOTION_PARAMETER_NULL_ERROR("50027", "Oops, something wrong happened"),
    /**
     * code:50028
     */
    PROMOTION_ORDER_NULL_ERROR("50028", "Oops, something wrong happened"),
    /**
     * code:50029
     */
    PROMOTION_TICKET_ORDER_NULL_ERROR("50029", "Oops, something wrong happened"),
    /**
     * code:50030
     */
    PROMOTION_SCHEDULE_NULL_ERROR("50030", "Oops, something wrong happened"),
    /**
     * code:50031
     */
    PROMOTION_USER_NULL_ERROR("50031", "Oops, something wrong happened"),
    /**
     * code:50032
     */
    PROMOTION_CINEMA_NULL_ERROR("50032", "Oops, something wrong happened"),
    /**
     * code:50033
     */
    PROMOTION_MOVIE_NULL_ERROR("50033", "Oops, something wrong happened"),
    /**
     * code:50034
     */
    PROMOTION_PLATFORM_NULL_ERROR("50034", "Oops, something wrong happened"),
    /**
     * code:50035
     */
    PROMOTION_CHANNEL_NULL_ERROR("50035", "Oops, something wrong happened"),
    /**
     * code:50036
     */
    PROMOTION_PERIOD_EMPTY("50036", "Oops, something wrong happened"),
    /**
     * code:50037
     */
    PROMOTION_TICKET_AMOUNT_ZERO("50037", "You should pay ticket amount offline, cannot avail this offer."),
    /**
     * code:50038
     */
    PROMOTION_QUALIFICATION_RELEASE_FAIL("50038", "Oops, something wrong happened"),
    ;

    PromotionResultCode(String code, String message) {
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
