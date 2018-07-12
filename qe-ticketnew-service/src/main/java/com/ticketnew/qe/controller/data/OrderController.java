package com.ticketnew.qe.controller.data;

import com.ticketnew.qe.api.entity.Order;
import com.ticketnew.qe.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * order controller
 *
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/19
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * create order
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Order createOrder(@RequestHeader("orderStatus") String orderStatus,
                             @RequestHeader("mobile") String mobile,
                             @RequestHeader("scheduleId") String scheduleId,
                             @RequestHeader("areaId") String areaId,
                             @RequestHeader("lockSeatCount") String lockSeatCount,
                             @RequestHeader(value = "promotionCode", required = false) String promotionCode) {
        return orderService.generateOrder(mobile, scheduleId, areaId, lockSeatCount, promotionCode, orderStatus);
    }

}
