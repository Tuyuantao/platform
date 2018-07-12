package com.ticketnew.qe.api.entity;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/23
 */
public class GoogleUserDTO {
    private String thirdUserEmail;
    private String thirdUserId;
    private String thirdUserName;

    public String getThirdUserName() {
        return thirdUserName;
    }

    public void setThirdUserName(String thirdUserName) {
        this.thirdUserName = thirdUserName;
    }

    public String getThirdUserEmail() {
        return thirdUserEmail;
    }

    public void setThirdUserEmail(String thirdUserEmail) {
        this.thirdUserEmail = thirdUserEmail;
    }

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
    }
}
