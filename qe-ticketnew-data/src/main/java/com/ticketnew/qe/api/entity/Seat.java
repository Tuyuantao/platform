package com.ticketnew.qe.api.entity;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/27
 */
public class Seat {
    private String twinId;
    private String status;
    private String name;
    private String type;
    private String extId;

    public String getTwinId() {
        return twinId;
    }

    public void setTwinId(String twinId) {
        this.twinId = twinId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }
}
