package com.ticketnew.qe.configure;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/11
 */
@Configuration
public class FilterConfig {

    @Bean
    public Filter provideCorsFilter() {
        return new CorsFilter();
    }
}
