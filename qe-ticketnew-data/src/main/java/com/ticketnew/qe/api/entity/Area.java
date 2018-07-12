package com.ticketnew.qe.api.entity;

import java.util.List;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/27
 */
public class Area {
    private Integer seatCount;
    private String extAreaId;
    private Integer specialCost;
    private List<Row> rows;
    private String message;
    private Integer availableSeatCount;
    private Integer price;
    private Integer selectionMode;
    private String areaName;
    private List<String> soldSeatIds;
    private boolean fbAvailable;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public String getExtAreaId() {
        return extAreaId;
    }

    public void setExtAreaId(String extAreaId) {
        this.extAreaId = extAreaId;
    }

    public Integer getSpecialCost() {
        return specialCost;
    }

    public void setSpecialCost(Integer specialCost) {
        this.specialCost = specialCost;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public Integer getAvailableSeatCount() {
        return availableSeatCount;
    }

    public void setAvailableSeatCount(Integer availableSeatCount) {
        this.availableSeatCount = availableSeatCount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSelectionMode() {
        return selectionMode;
    }

    public void setSelectionMode(Integer selectionMode) {
        this.selectionMode = selectionMode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public List<String> getSoldSeatIds() {
        return soldSeatIds;
    }

    public void setSoldSeatIds(List<String> soldSeatIds) {
        this.soldSeatIds = soldSeatIds;
    }

    public boolean isFbAvailable() {
        return fbAvailable;
    }

    public void setFbAvailable(boolean fbAvailable) {
        this.fbAvailable = fbAvailable;
    }
}
