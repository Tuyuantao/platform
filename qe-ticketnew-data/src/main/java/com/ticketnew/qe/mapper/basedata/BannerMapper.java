package com.ticketnew.qe.mapper.basedata;

import java.util.List;

import com.ticketnew.qe.dto.BannerDO;
import com.ticketnew.qe.mapper.Mapper;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/19
 */
public interface BannerMapper extends Mapper{

    /**
     * select all banner data
     * @return
     */
    List<BannerDO> selectAll();

    /**
     * insert banner data
     * @param bannerDOS
     * @return
     */
    int insert(List<BannerDO> bannerDOS);
}
