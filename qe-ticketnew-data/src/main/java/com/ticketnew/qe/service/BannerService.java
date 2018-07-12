package com.ticketnew.qe.service;

import java.sql.Timestamp;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/19
 */
public interface BannerService {

    /**
     * generate banner
     * @param bannerName
     * @param startTime
     * @param endTime
     * @param imageUrl
     * @param redirectUrl
     * @param position
     * @param platform
     * @param channel
     * @param priority
     * @param regionId
     * @return
     */
    boolean generateBanner(String bannerName, String startTime, String endTime, String imageUrl,
                           String redirectUrl, String position, String platform, String channel, Integer priority,
                           String regionId);
}
