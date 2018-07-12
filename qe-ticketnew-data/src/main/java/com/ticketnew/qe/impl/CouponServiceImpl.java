package com.ticketnew.qe.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ticketnew.qe.api.util.StringUtils;
import com.ticketnew.qe.dto.CouponDO;
import com.ticketnew.qe.exceptions.ParamIncorrectException;
import com.ticketnew.qe.mapper.basedata.CouponMapper;
import com.ticketnew.qe.service.CouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/18
 */
public class CouponServiceImpl implements CouponService {

    private final Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);
    private final Long oneMonth = 30*24*60*60*1000l;;

    @Autowired
    CouponMapper couponMapper;

    @Value("${promo.promotionId}")
    Long promotionId;

    /**
     * generate number coupons by insert data into db
     *
     * @param quantity
     * @return
     */
    @Override
    public List<String> generateCoupon(int quantity) {

        if (quantity <= 0) {
            throw new ParamIncorrectException(String.format("number value %d is less equal than 0", quantity));
        }

        List<CouponDO> existingCouponDOS = couponMapper.selectCouponByPromotionId(Long.valueOf(promotionId));
        List<String> existingCouponCode = existingCouponDOS.stream()
            .map(couponDO -> couponDO.getCoupon_code())
            .collect(Collectors.toList());

        List<String> newCouponCode = new ArrayList<>();
        for (int i = 0; i < quantity; ) {
            String couponCode = StringUtils.generateString(6);
            if (existingCouponCode.contains(couponCode)) {
                continue;
            }
            newCouponCode.add(couponCode);
            i++;
        }

        List<CouponDO> newCouponDOS = newCouponCode.stream().map(couponCode -> {
            CouponDO couponDO = new CouponDO();
            Long currentTime = System.currentTimeMillis();
            couponDO.setCoupon_code(couponCode);
            couponDO.setPromotion_id(Long.valueOf(promotionId));
            couponDO.setStart_time(new Timestamp(currentTime - oneMonth));
            couponDO.setEnd_time(new Timestamp(currentTime + oneMonth));
            couponDO.setCreator("robot");
            couponDO.setRepeatable(new Byte("0"));
            return couponDO;
        }).collect(Collectors.toList());
        couponMapper.insert(newCouponDOS);
        logger.info(String.format("CouponCode[%s]",StringUtils.arrayToString(newCouponCode.toArray(),",")));
        return newCouponCode;
    }
}
