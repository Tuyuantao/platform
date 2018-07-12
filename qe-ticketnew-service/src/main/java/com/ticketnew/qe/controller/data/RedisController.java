package com.ticketnew.qe.controller.data;

import javax.annotation.Resource;

import com.ticketnew.qe.api.entity.Account;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/8/28
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Resource(name = "redisTemplate")
    private HashOperations<String, String, Account> hashOps;

    @Resource(name = "redisTemplate")
    private ListOperations<String, Account> listOperations;

    @Resource(name = "redisTemplate")
    private ValueOperations<String, Account> valueOperations;

    private static final String KEY = "Account";

    @RequestMapping(method = RequestMethod.GET)
    public Account generatePromotionCode() {

        Account account = new Account();
        account.setMobile("100002");
        account.setEmail("test@email.com");
        account.setPassword("Aa1234567");
        hashOps.put(KEY, account.getMobile(), account);

        return hashOps.get(KEY, account.getMobile());
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public Account getAccount() {
        Account account = new Account();
        account.setMobile("100003");
        account.setEmail("test@email.com");
        account.setPassword("Aa1234567");

        listOperations.rightPush("list", account);
        return listOperations.rightPop("list");
    }

    @RequestMapping(path = "/test1", method = RequestMethod.GET)
    public Account getTestAccount() {
        Account account = new Account();
        account.setMobile("100004");
        account.setEmail("test@email.com");
        account.setPassword("Aa1234567");

        valueOperations.set("value", account);
        return valueOperations.get("value");
    }
}
