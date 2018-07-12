package com.ticketnew.qe.mapper.account;

import com.ticketnew.qe.dto.AccountDO;
import com.ticketnew.qe.mapper.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/16
 */
public interface AccountMapper extends Mapper{

    /**
     * select acccount by mobile
     * @param mobile
     * @return
     */
    AccountDO selectAccountByMobile(@Param("mobile") String mobile);

}
