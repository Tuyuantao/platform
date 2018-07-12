package com.ticketnew.qe.service;

import com.ticketnew.qe.dto.AccountDO;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/7
 */
public interface AccountService {

    /**
     * create account
     * @return
     */
    AccountDO createAccount();

    /**
     * fetch account by mobile
     * @param mobile
     * @return
     */
    AccountDO getAccount(String mobile);
}
