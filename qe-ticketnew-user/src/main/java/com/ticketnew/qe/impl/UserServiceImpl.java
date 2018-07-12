package com.ticketnew.qe.impl;

import com.ticketnew.qe.service.UserService;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/5
 */
public class UserServiceImpl implements UserService {
    public String trackUser() {
        return "this user's log: login successfully, fail in seat map : cinema 1, schedule 1, region 1";
    }
}
