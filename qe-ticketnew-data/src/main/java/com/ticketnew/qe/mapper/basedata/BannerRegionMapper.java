package com.ticketnew.qe.mapper.basedata;

import java.util.List;

import com.ticketnew.qe.dto.BannerRegionDO;
import com.ticketnew.qe.mapper.Mapper;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/19
 */
public interface BannerRegionMapper extends Mapper {

    /**
     * insert data
     * @param bannerRegionDOS
     * @return
     */
    int insert(List<BannerRegionDO> bannerRegionDOS);
}
