package com.ticketnew.qe.api.entity;

import java.io.Serializable;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/27
 */
public class Account implements Serializable{

    private String mobile;
    private String password;
    private String email;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
