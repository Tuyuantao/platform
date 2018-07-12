package com.ticketnew.qe.controller.data;

import com.ticketnew.qe.dto.AccountDO;
import com.ticketnew.qe.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Account controller
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/7
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    /**
     * create account
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public AccountDO createAccount() {
        return accountService.createAccount();
    }

    /**
     * get account entity via mobile
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,produces = "application/json")
    public AccountDO getAccount() {
        AccountDO accountDO = accountService.getAccount("9894525466");
        return accountDO;
    }

}
