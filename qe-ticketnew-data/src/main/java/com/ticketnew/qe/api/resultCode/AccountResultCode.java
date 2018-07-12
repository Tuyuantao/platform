package com.ticketnew.qe.api.resultCode;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/16
 */
public enum AccountResultCode implements ResultCode {

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
    ;

    AccountResultCode(String code, String message) {
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
