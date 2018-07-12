package com.ticketnew.qe.api.csb;

import com.google.gson.JsonElement;
import com.jayway.jsonpath.JsonPath;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/19
 */
public class Body {
    private String resultCode;
    private JsonElement data;
    private String resultMessage;
    private boolean success;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public JsonElement getData() {
        return data;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public <T> T get(String jsonPath) {
        return JsonPath.read(this.toString(), jsonPath);
    }

    @Override
    public String toString() {
        return "{"
                + "\"resultCode\": " + "\"" + resultCode + "\","
                + (data == null? "": ("\"data\": "+ data.toString() + ","))
                + "\"resultMessage\":" + "\"" + resultMessage + "\","
                + "\"success\":" + success
                + "}";
    }
}
