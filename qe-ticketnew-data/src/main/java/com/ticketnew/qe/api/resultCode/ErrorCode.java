package com.ticketnew.qe.api.resultCode;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/16
 */
public enum ErrorCode implements ResultCode{
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
    BASEDATA_LOCK_COUNT_NULL("20014", "auto lock count not be null"),

    /**
     * account
     */
    /**
     * code:30000
     */
    ACCOUNT_SYSTEM_ERROR("30000", "Oops, something wrong happened"),
    /**
     * code:30001
     */
    ACCOUNT_PARAMETER_NULL_ERROR("30001", "Please fill in all blanks"),
    /**
     * code:30003
     */
    ACCOUNT_MOBILE_FORMAT_ERROR("30003", "Mobile phone number input error"),
    /**
     * code:30004
     */
    ACCOUNT_OLD_MOBILE_FORMAT_ERROR("30004", "Old mobile phone number input error"),
    /**
     * code:30005
     */
    ACCOUNT_NEW_MOBILE_FORMAT_ERROR("30005", "New mobile phone number input error"),
    /**
     * code:30006
     */
    ACCOUNT_EMAIL_FORMAT_ERROR("30006", "Email input error"),
    /**
     * code:30007
     */
    ACCOUNT_PASSWORD_FORMAT_ERROR("30007", "Invalid password. Passwords must contain letters and numbers, up to 6-20 Characters"),
    /**
     * code:30008
     */
    ACCOUNT_PASSWORD_ERROR("30008", "Invalid password"),
    /**
     * code:30009
     */
    ACCOUNT_SECURITY_OTP_FORMAT_ERROR("30009", "Verification code should be 4 digits"),
    /**
     * code:30010
     */
    ACCOUNT_NOT_EXISTE("30010", "Account does not exist"),
    /**
     * code:30011
     */
    ACCOUNT_MOBILE_REGISTERED("30011", "The mobile number has already been registered"),
    /**
     * code:30012
     */
    ACCOUNT_THIRD_EMAIL_NOT_EXIST("30012", "Third Account does not exist"),
    /**
     * code:30013
     */
    ACCOUNT_MOBILE_UNBIND_DUPLICATE("30013", "The mobile number has been linked to more than one email, please change to another mobile or login with email"),
    /**
     * code:30014
     */
    ACCOUNT_TOKEN_NOT_MATCH("30014", "Invalid token"),
    /**
     * code:30015
     */
    ACCOUNT_SECURITY_OTP_VERIFY_FAIL("30015", "Verification code input error"),
    /**
     * code:30016
     */
    ACCOUNT_SECURITY_OTP_SECONDS_LIMITATION("30016", "Do not be repeated to send the phone verification code within 30 seconds"),
    /**
     * code:30017
     */
    ACCOUNT_SECURITY_OTP_TIMES_LIMITATION("30017", "Verification code can only be sent up to 10 times a day, please come back tomorrow"),
    /**
     * code:30018
     */
    ACCOUNT_FEEDBACK_PARAMETER_NULL_ERROR("30018", "Please fill in all blanks"),
    /**
     * code:30019
     */
    PROFILE_MOBILE_ALREADY_TOKEN("30019", "The mobile number has been linked to another account"),
    /**
     * code:30020
     */
    PROFILE_THIRD_ALREADY_TOKEN("30020", "The third account has been linked to another account"),
    /**
     * code:30021
     */
    NORMAL_LOGIN_MOBILE_NOT_EXIST("30021", "Mobile does not exist. You can login by email or register a new account."),
    /**
     * code:30022
     */
    REGISTER_EMAIL_ACCOUNT_NOT_EXIST("30022", "Email does not exist"),
    /**
     * code:30023
     */
    REGISTERED_EMAIL_REGISTERED("30023", "The email has been registered"),
    /**
     * code:30024
     */
    THIRD_LOGIN_MOBILE_ERROR("30024", "mobile not match the exist account's mobile"),
    /**
     * code:30025
     */
    PROFILE_EMAIL_ALREADY_TOKEN("30025", "The email has been linked to another account"),
    /**
     * code:30026
     */
    PROFILE_MOBILE_BIND_FAIL("30026", "Oops, something wrong happened"),
    /**
     * code:30027
     */
    PROFILE_EDIT_FAIL("30027", "Oops, something wrong happened"),
    /**
     * code:30028
     */
    PROFILE_EMAIL_BIND_FAIL("30028", "Oops, something wrong happened"),
    /**
     * code:30029
     */
    PROFILE_THIRD_BIND_FAIL("30029", "Oops, something wrong happened"),
    /**
     * code:30030
     */
    PROFILE_THIRD_UNBIND_FAIL("30030", "Oops, something wrong happened"),
    /**
     * code:30031
     */
    PROFILE_CHANGE_PASSWORD_FAIL("30031", "Oops, something wrong happened"),
    /**
     * code:30032
     */
    PROFILE_FIND_PASSWORD_FAIL("30032", "Oops, something wrong happened"),
    /**
     * code:30033
     */
    SYNC_ACCOUNT_FAIL("30033", "Oops, something wrong happened"),

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
    TRADE_LOCK_SEAT_ONLY_USER_MODE("40025", "can only lock seat by user"),
    /**
     * code:40026
     */
    TRADE_LOCK_SEAT_ONLY_SYSTEM_MODE("40026", "can not lock seat by user"),
    /**
     * code:40027
     */
    TRADE_REFUND_FAIL("40027", "Oops, something wrong happened"),
    /**
     * code:40028
     */
    TRADE_CAN_NOT_CLOSE("40028", "trade can not be closed"),
    /**
     * code:40029
     */
    TRADE_CLOSE_ERROR("40029", "trade close error, please try again later"),

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

    /**
     * LotteryRequestWithoutLogin
     */
    LOTTERY_DRAW_FAIL("70000", "Oops, something wrong happened"),
    LOTTERY_DRAW_PARAM_EMPTY("70001", "Oops, something wrong happened"),
    LOTTERY_DRAW_CHANGES_RUN_OUT("70002", "You cannot avail this lottery, not enough chances"),
    LOTTERY_NOT_EXIST("70003", "Lottery not exist"),;

    private ErrorCode(String code, String message) {
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
