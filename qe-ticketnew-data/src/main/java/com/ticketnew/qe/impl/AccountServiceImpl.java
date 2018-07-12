package com.ticketnew.qe.impl;

import com.ticketnew.qe.api.account.AccountUtil;
import com.ticketnew.qe.api.entity.Account;
import com.ticketnew.qe.dto.AccountDO;
import com.ticketnew.qe.mapper.account.AccountMapper;
import com.ticketnew.qe.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/7
 */
public class AccountServiceImpl implements AccountService {

    private final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    AccountMapper accountMapper;

    @Override
    public AccountDO createAccount() {
        Account account = AccountUtil.createAccountWithMobile();
        AccountDO accountDO = accountMapper.selectAccountByMobile(account.getMobile());
        logger.info(accountDO.toString());
        return accountDO;
    }

    @Override
    public AccountDO getAccount(String mobile) {
        AccountDO accountDO = accountMapper.selectAccountByMobile(mobile);
        logger.info(accountDO.toString());
        return accountDO;
    }
}
