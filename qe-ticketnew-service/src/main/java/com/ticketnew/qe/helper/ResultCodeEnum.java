package com.ticketnew.qe.helper;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/19
 */
public enum  ResultCodeEnum {

    SUCCESS("200","Successful"),
    FAIL("201","Fail"),
    ;

    private String code;
    private String message;

    ResultCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
