package com.ticketnew.qe.service;

import java.util.List;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/18
 */
public interface CouponService {

    /**
     * generate coupon
     *
     * @param quantity
     * @return
     */
    List<String> generateCoupon(int quantity);
}
