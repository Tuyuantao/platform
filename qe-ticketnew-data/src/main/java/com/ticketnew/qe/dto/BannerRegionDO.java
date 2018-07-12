package com.ticketnew.qe.dto;

import java.sql.Timestamp;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/19
 */
public class BannerRegionDO implements BasicDTO {

    private Long id;
    private Timestamp gmt_create;
    private Timestamp gmt_modified;
    private Long banner_id;
    private Long region_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Timestamp gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Timestamp getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Timestamp gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public Long getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(Long banner_id) {
        this.banner_id = banner_id;
    }

    public Long getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Long region_id) {
        this.region_id = region_id;
    }
}
