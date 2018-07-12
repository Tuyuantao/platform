package com.ticketnew.qe.api.entity;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/5/24
 */
public class ScheduleArea {

    private int seatCount;
    private int specialCost;
    private String extAreaId;
    private int availableSeatCount;
    private int price;
    private String areaName;
    private int selectionMode;
    private boolean fbAvailable;

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public int getSpecialCost() {
        return specialCost;
    }

    public void setSpecialCost(int specialCost) {
        this.specialCost = specialCost;
    }

    public String getExtAreaId() {
        return extAreaId;
    }

    public void setExtAreaId(String extAreaId) {
        this.extAreaId = extAreaId;
    }

    public int getAvailableSeatCount() {
        return availableSeatCount;
    }

    public void setAvailableSeatCount(int availableSeatCount) {
        this.availableSeatCount = availableSeatCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getSelectionMode() {
        return selectionMode;
    }

    public void setSelectionMode(int selectionMode) {
        this.selectionMode = selectionMode;
    }

    public boolean isFbAvailable() {
        return fbAvailable;
    }

    public void setFbAvailable(boolean fbAvailable) {
        this.fbAvailable = fbAvailable;
    }
}
