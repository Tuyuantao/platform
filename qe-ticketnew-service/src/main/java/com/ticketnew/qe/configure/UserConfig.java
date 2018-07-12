package com.ticketnew.qe.configure;

import com.ticketnew.qe.impl.UserServiceImpl;
import com.ticketnew.qe.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/5
 */
@Component
public class UserConfig {

    @Bean("userService")
    public UserService getUserService() {
        return new UserServiceImpl();
    }

}
