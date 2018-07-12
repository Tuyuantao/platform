package com.ticketnew.qe.api.entity;

import java.util.List;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/19
 */
public class Cinema {
    private boolean loadAllSeat;
    private boolean favorite;
    private int todayScheduleCount;
    private int scheduleCount;
    private String status;
    private String codeType;
    private boolean donation;
    private String companyName;
    private int donationAmount;
    private String companyCode;
    private boolean hiddenAvailableSeat;
    private int id;
    private String extId;
    private int lockSeatMinute;
    private int minTicket;
    private String name;
    private int maxTicket;
    private boolean hiddenPrice;
    private int regionId;
    private List<CinemaTag> tags;

    //for cinema seat job
    private long scheduleId;
    private String errorInfo;

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public boolean isLoadAllSeat() {
        return loadAllSeat;
    }

    public void setLoadAllSeat(boolean loadAllSeat) {
        this.loadAllSeat = loadAllSeat;
    }

    public int getTodayScheduleCount() {
        return todayScheduleCount;
    }

    public void setTodayScheduleCount(int todayScheduleCount) {
        this.todayScheduleCount = todayScheduleCount;
    }

    public int getScheduleCount() {
        return scheduleCount;
    }

    public void setScheduleCount(int scheduleCount) {
        this.scheduleCount = scheduleCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public boolean isDonation() {
        return donation;
    }

    public void setDonation(boolean donation) {
        this.donation = donation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(int donationAmount) {
        this.donationAmount = donationAmount;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public boolean isHiddenAvailableSeat() {
        return hiddenAvailableSeat;
    }

    public void setHiddenAvailableSeat(boolean hiddenAvailableSeat) {
        this.hiddenAvailableSeat = hiddenAvailableSeat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLockSeatMinute() {
        return lockSeatMinute;
    }

    public void setLockSeatMinute(int lockSeatMinute) {
        this.lockSeatMinute = lockSeatMinute;
    }

    public int getMinTicket() {
        return minTicket;
    }

    public void setMinTicket(int minTicket) {
        this.minTicket = minTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTicket() {
        return maxTicket;
    }

    public void setMaxTicket(int maxTicket) {
        this.maxTicket = maxTicket;
    }

    public boolean isHiddenPrice() {
        return hiddenPrice;
    }

    public void setHiddenPrice(boolean hiddenPrice) {
        this.hiddenPrice = hiddenPrice;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public List<CinemaTag> getTags() {
        return tags;
    }

    public void setTags(List<CinemaTag> tags) {
        this.tags = tags;
    }
}
