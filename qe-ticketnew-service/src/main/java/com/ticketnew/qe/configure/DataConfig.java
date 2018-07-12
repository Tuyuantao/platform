package com.ticketnew.qe.configure;

import com.ticketnew.qe.impl.AccountServiceImpl;
import com.ticketnew.qe.impl.BannerServiceImpl;
import com.ticketnew.qe.impl.CouponServiceImpl;
import com.ticketnew.qe.impl.OrderServiceImpl;
import com.ticketnew.qe.impl.UnavailableCinemaServiceImpl;
import com.ticketnew.qe.service.AccountService;
import com.ticketnew.qe.service.BannerService;
import com.ticketnew.qe.service.CouponService;
import com.ticketnew.qe.service.OrderService;
import com.ticketnew.qe.service.UnavailableCinemaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/5
 */
@Configuration
public class DataConfig {

    @Bean("orderService")
    public OrderService provideOrderService() {
        return new OrderServiceImpl();
    }

    @Bean("accountService")
    public AccountService provideAccountService() {
        return new AccountServiceImpl();
    }

    @Bean("unavailableCinemaService")
    public UnavailableCinemaService provideUnavailableCinemaService() {
        return new UnavailableCinemaServiceImpl();
    }

    @Bean("couponService")
    public CouponService provideCouponService() {
        return new CouponServiceImpl();
    }

    @Bean("bannerService")
    public BannerService provideBannerService() {
        return new BannerServiceImpl();
    }

}
