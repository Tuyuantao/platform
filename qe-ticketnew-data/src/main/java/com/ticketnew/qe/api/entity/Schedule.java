package com.ticketnew.qe.api.entity;

import java.util.List;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/5/24
 */
public class Schedule {

    private boolean payAtCounter;
    private int id;
    private String screen;
    private int seatCount;
    private List<ScheduleArea> scheduleAreas;
    private int availableSeatCount;
    private long closeTime;
    private long showtime;

    public boolean isPayAtCounter() {
        return payAtCounter;
    }

    public void setPayAtCounter(boolean payAtCounter) {
        this.payAtCounter = payAtCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public List<ScheduleArea> getScheduleAreas() {
        return scheduleAreas;
    }

    public void setScheduleAreas(List<ScheduleArea> scheduleAreas) {
        this.scheduleAreas = scheduleAreas;
    }

    public int getAvailableSeatCount() {
        return availableSeatCount;
    }

    public void setAvailableSeatCount(int availableSeatCount) {
        this.availableSeatCount = availableSeatCount;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(long closeTime) {
        this.closeTime = closeTime;
    }

    public long getShowtime() {
        return showtime;
    }

    public void setShowtime(long showtime) {
        this.showtime = showtime;
    }
}
