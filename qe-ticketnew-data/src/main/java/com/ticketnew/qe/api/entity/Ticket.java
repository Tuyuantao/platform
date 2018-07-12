package com.ticketnew.qe.api.entity;

import java.util.List;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/5/26
 */
public class Ticket {
    private int amount;
    private String areaName;
    private String extAreaId;
    private List<FeeDetail> feeDetails;
    private int quantity;
    private String codeType;
    private String code;
    private String seatName;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getExtAreaId() {
        return extAreaId;
    }

    public void setExtAreaId(String extAreaId) {
        this.extAreaId = extAreaId;
    }

    public List<FeeDetail> getFeeDetails() {
        return feeDetails;
    }

    public void setFeeDetails(List<FeeDetail> feeDetails) {
        this.feeDetails = feeDetails;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }
}
