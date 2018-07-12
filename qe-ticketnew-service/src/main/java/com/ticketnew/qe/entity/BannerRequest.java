package com.ticketnew.qe.entity;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/24
 */
public class BannerRequest {
    private String bannerName;
    private String startTime;
    private String endTime;
    private String imageUrl;
    private String redirectUrl;
    private String position;
    private String platform;
    private String channel;
    private Integer priority;
    private String regionId;

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return "BannerRequest{" +
            "bannerName='" + bannerName + '\'' +
            ", startTime='" + startTime + '\'' +
            ", endTime='" + endTime + '\'' +
            ", imageUrl='" + imageUrl + '\'' +
            ", redirectUrl='" + redirectUrl + '\'' +
            ", position='" + position + '\'' +
            ", platform='" + platform + '\'' +
            ", channel='" + channel + '\'' +
            ", priority='" + priority + '\'' +
            ", regionId='" + regionId + '\'' +
            '}';
    }
}
