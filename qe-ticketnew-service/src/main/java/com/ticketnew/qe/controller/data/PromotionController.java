package com.ticketnew.qe.controller.data;

import java.util.List;

import com.ticketnew.qe.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/18
 */
@RestController
@RequestMapping("/promotion")
public class PromotionController {

    @Autowired
    CouponService couponService;

    @RequestMapping(path = "/couponcode",method = RequestMethod.POST)
    public List<String> generatePromotionCode(@RequestHeader("quantity") int quantity) {
        return couponService.generateCoupon(quantity);
    }
}
