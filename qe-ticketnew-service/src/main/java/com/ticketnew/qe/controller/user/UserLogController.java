package com.ticketnew.qe.controller.user;

import com.ticketnew.qe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user controller
 *
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/19
 */
@RestController
@RequestMapping("/user")
public class UserLogController {

    @Autowired
    UserService userService;

    @RequestMapping("/")

    public String getUserLog() {
        return userService.trackUser();
    }

}
