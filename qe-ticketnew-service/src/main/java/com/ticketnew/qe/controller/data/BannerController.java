package com.ticketnew.qe.controller.data;

import com.ticketnew.qe.entity.BannerRequest;
import com.ticketnew.qe.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/19
 *
 * create banner for region
 */
@RestController
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    BannerService bannerService;

    @RequestMapping(method = RequestMethod.POST)
    public String createBanner(@RequestBody BannerRequest bannerRequest) {
        if (bannerService.generateBanner(bannerRequest.getBannerName(), bannerRequest.getStartTime(),
            bannerRequest.getEndTime(), bannerRequest.getImageUrl(), bannerRequest.getRedirectUrl(),
            bannerRequest.getPosition(), bannerRequest.getPlatform(), bannerRequest.getChannel(),
            bannerRequest.getPriority(), bannerRequest.getRegionId())) {
            return "success";
        }

        return "fail";
    }
}
