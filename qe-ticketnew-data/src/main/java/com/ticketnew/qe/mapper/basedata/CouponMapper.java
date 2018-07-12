package com.ticketnew.qe.mapper.basedata;

import java.util.List;

import com.ticketnew.qe.dto.CouponDO;
import com.ticketnew.qe.mapper.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/18
 */
public interface CouponMapper extends Mapper {

    /**
     * select coupon by promotion id
     *
     * @param promotionId
     * @return
     */
    List<CouponDO> selectCouponByPromotionId(@Param("promotionId") Long promotionId);

    /**
     * insert data into database
     *
     * @return
     */
    int insert(List<CouponDO> couponDOS);
}
