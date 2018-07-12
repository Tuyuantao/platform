package com.ticketnew.qe.service;

import com.ticketnew.qe.api.entity.Order;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/19
 */

public interface OrderService {

    /**
     * generate order
     *
     * @return
     */
    Order generateOrder(String mobile, String scheduleId, String areaId, String lockSeatCount,
                        String promotionCode, String orderStatus);
}
