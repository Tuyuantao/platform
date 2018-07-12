package com.ticketnew.qe.helper;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/19
 */
public class ResultEntity {

    private String code;
    private String message;
    private Object body;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
