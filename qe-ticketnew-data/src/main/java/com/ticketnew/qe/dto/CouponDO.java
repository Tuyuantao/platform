package com.ticketnew.qe.dto;

import java.sql.Timestamp;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/18
 */
public class CouponDO implements BasicDTO {
    private Long id;
    private Timestamp gmt_create;
    private Timestamp gmt_modified;
    private Long promotion_id;
    private Long lottery_id;
    private String coupon_code;
    private Timestamp start_time;
    private Timestamp end_time;
    private Byte repeatable;
    private String period;
    private Integer repeat_times;
    private String creator;
    private String last_modifier;
    private Byte is_draw;
    private String draw_user;
    private String valid_draw_date;

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

    public long getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(Long promotion_id) {
        this.promotion_id = promotion_id;
    }

    public Long getLottery_id() {
        return lottery_id;
    }

    public void setLottery_id(Long lottery_id) {
        this.lottery_id = lottery_id;
    }

    public String getCoupon_code() {
        return coupon_code;
    }

    public void setCoupon_code(String coupon_code) {
        this.coupon_code = coupon_code;
    }

    public Timestamp getStart_time() {
        return start_time;
    }

    public void setStart_time(Timestamp start_time) {
        this.start_time = start_time;
    }

    public Timestamp getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Timestamp end_time) {
        this.end_time = end_time;
    }

    public Byte getRepeatable() {
        return repeatable;
    }

    public void setRepeatable(Byte repeatable) {
        this.repeatable = repeatable;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getRepeat_times() {
        return repeat_times;
    }

    public void setRepeat_times(Integer repeat_times) {
        this.repeat_times = repeat_times;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getLast_modifier() {
        return last_modifier;
    }

    public void setLast_modifier(String last_modifier) {
        this.last_modifier = last_modifier;
    }

    public Byte getIs_draw() {
        return is_draw;
    }

    public void setIs_draw(Byte is_draw) {
        this.is_draw = is_draw;
    }

    public String getDraw_user() {
        return draw_user;
    }

    public void setDraw_user(String draw_user) {
        this.draw_user = draw_user;
    }

    public String getValid_draw_date() {
        return valid_draw_date;
    }

    public void setValid_draw_date(String valid_draw_date) {
        this.valid_draw_date = valid_draw_date;
    }
}
