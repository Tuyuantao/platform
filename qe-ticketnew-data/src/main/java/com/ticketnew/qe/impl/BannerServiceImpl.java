package com.ticketnew.qe.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.common.base.Strings;
import com.ticketnew.qe.api.csb.VersionEnum;
import com.ticketnew.qe.date.DateUtil;
import com.ticketnew.qe.dto.BannerDO;
import com.ticketnew.qe.dto.BannerRegionDO;
import com.ticketnew.qe.mapper.basedata.BannerMapper;
import com.ticketnew.qe.mapper.basedata.BannerRegionMapper;
import com.ticketnew.qe.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/19
 */
public class BannerServiceImpl implements BannerService {

    private final String imageUrl = "tn/banner/indextop/sathriyan.jpg";
    private final String bannerName = "Banner Name";
    private final String redirectUrl = "http://m.ticketnew.com";
    private final String position = "INDEX_TOP";
    private final String platform = "H5";
    private final String playWay = "AUTO";
    private final Integer priority = 1;
    private final String status = "ONLINE";
    private final String env = "test";
    private final String type = "1";
    private final Integer bannerVersion = 0;
    private final String chennai = "1";
    private final Long oneMonth = 30 * 24 * 60 * 60 * 1000L;

    @Autowired
    BannerMapper bannerMapper;

    @Autowired
    BannerRegionMapper bannerRegionMapper;

    /**
     * generate banner
     *
     * @return
     */
    @Override
    public boolean generateBanner(String bannerName, String startTime, String endTime, String imageUrl,
                                  String redirectUrl, String position, String platform, String channel,
                                  Integer priority,
                                  String regionId) {

        if (Strings.isNullOrEmpty(regionId)) {
            regionId = chennai;
        }
        List<BannerDO> bannerDOS = new ArrayList<>();
        BannerDO bannerDO = getBannerDO(bannerName, startTime, endTime, imageUrl, redirectUrl, position, platform,
            channel, priority);
        bannerDOS.add(bannerDO);
        int result = bannerMapper.insert(bannerDOS);
        if (result < 0) {
            return false;
        }
        if (regionId == null) {
            return false;
        }
        String[] regionIds = regionId.split(",");
        List<BannerRegionDO> bannerRegionDOS = new ArrayList<>();
        for (String id : regionIds) {
            BannerRegionDO bannerRegionDO = new BannerRegionDO();
            bannerDO.setGmt_create(new Timestamp(System.currentTimeMillis()));
            bannerDO.setGmt_modified(new Timestamp(System.currentTimeMillis()));
            bannerRegionDO.setBanner_id(bannerDOS.get(0).getId());
            bannerRegionDO.setRegion_id(Long.valueOf(id));
            bannerRegionDOS.add(bannerRegionDO);
        }
        int bannerRegionResult = bannerRegionMapper.insert(bannerRegionDOS);
        return bannerRegionResult > 0 ? true : false;
    }

    public BannerDO getBannerDO(String bannerName, String startTime, String endTime, String imageUrl,
                                String redirectUrl, String position, String platform, String channel,
                                Integer priority) {
        Timestamp startDate;
        Timestamp endDate;

        if (Strings.isNullOrEmpty(startTime)) {
            startDate = new Timestamp(System.currentTimeMillis() - oneMonth);
        } else {
            try {
                startDate = new Timestamp(DateUtil.format(startTime, "yyyy-MM-dd HH:mm:ss").getTime());
            } catch (Exception e) {
                startDate = new Timestamp(System.currentTimeMillis() - oneMonth);
            }
        }

        if (Strings.isNullOrEmpty(endTime)) {
            endDate = new Timestamp(System.currentTimeMillis() + oneMonth);
        } else {
            try {
                endDate = new Timestamp(DateUtil.format(endTime, "yyyy-MM-dd HH:mm:ss").getTime());
            } catch (Exception e) {
                endDate = new Timestamp(System.currentTimeMillis() - oneMonth);
            }
        }

        if (Strings.isNullOrEmpty(bannerName)) {
            bannerName = this.bannerName;
        }

        if (Strings.isNullOrEmpty(imageUrl)) {
            imageUrl = this.imageUrl;
        }

        if (Strings.isNullOrEmpty(redirectUrl)) {
            redirectUrl = this.redirectUrl;
        }

        if (Strings.isNullOrEmpty(position)) {
            position = this.position;
        }

        if (Strings.isNullOrEmpty(platform)) {
            platform = this.platform;
        }

        if (priority == null) {
            priority = this.priority;
        }

        if(Strings.isNullOrEmpty(channel)) {
            channel = null;
        }

        BannerDO bannerDO = new BannerDO();
        bannerDO.setStart_time(startDate);
        bannerDO.setEnd_time(endDate);
        bannerDO.setBanner_name(bannerName);
        bannerDO.setUrl(imageUrl);
        bannerDO.setRedirect_url(redirectUrl);
        bannerDO.setPosition(position);
        bannerDO.setPlatform(platform);
        bannerDO.setPriority(priority);
        bannerDO.setChannel(channel);
        bannerDO.setPlay_way(this.playWay);
        bannerDO.setStatus(this.status);
        bannerDO.setEnv(this.env);
        bannerDO.setType(this.type);
        bannerDO.setBanner_version(this.bannerVersion);
        bannerDO.setVersion(VersionEnum.VERSION_4_2.getVersion());
        return bannerDO;
    }
}
