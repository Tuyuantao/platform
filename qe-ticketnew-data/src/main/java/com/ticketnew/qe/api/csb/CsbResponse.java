package com.ticketnew.qe.api.csb;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/19
 */
public class CsbResponse {

    private int code;
    private String message;
    private String requestId;
    private Body body;

    public CsbResponse(String response) {
        Gson gson = new GsonBuilder().create();
        CsbResponse csbResponse = gson.fromJson(response, CsbResponse.class);
        this.code = csbResponse.getCode();
        this.message = csbResponse.getMessage();
        this.requestId = csbResponse.getRequestId();
        this.body = csbResponse.getBody();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public boolean isValid() {
        if(200 == getCode() && null != getBody() && "0".equals(getBody().getResultCode())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "{"
                + (body==null ?"":("\"body\":" + body.toString() + ","))
                + "\"code\":" + code + ","
                + "\"message\":" + "\"" + message + "\","
                + "\"requestId\":" + "\"" + requestId + "\""
                + "}";
    }
}
