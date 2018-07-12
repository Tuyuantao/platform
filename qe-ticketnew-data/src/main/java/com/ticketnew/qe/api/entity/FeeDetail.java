package com.ticketnew.qe.api.entity;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/5/26
 */
public class FeeDetail {
    private int fee;
    private String name;
    private int quantity;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
