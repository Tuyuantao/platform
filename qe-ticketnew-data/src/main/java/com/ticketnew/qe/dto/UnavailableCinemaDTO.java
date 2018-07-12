package com.ticketnew.qe.dto;

import java.sql.Timestamp;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/12
 */
public class UnavailableCinemaDTO implements BasicDTO{

    private long id;
    private long cinema_id;
    private String cinema_ext_id;
    private String cinema_name;
    private String cinema_type;
    private long region_id;
    private String region_ext_id;
    private String region_name;
    private long schedule_id;
    private String schedule_ext_id;
    private String cinema_status;
    private int rerun_times;
    private String failed_reason;
    private Timestamp store_date;

    public long getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(long schedule_id) {
        this.schedule_id = schedule_id;
    }

    public String getSchedule_ext_id() {
        return schedule_ext_id;
    }

    public void setSchedule_ext_id(String schedule_ext_id) {
        this.schedule_ext_id = schedule_ext_id;
    }

    public String getFailed_reason() {
        return failed_reason;
    }

    public void setFailed_reason(String failed_reason) {
        this.failed_reason = failed_reason;
    }

    public String getCinema_type() {
        return cinema_type;
    }

    public void setCinema_type(String cinema_type) {
        this.cinema_type = cinema_type;
    }

    public String getCinema_status() {
        return cinema_status;
    }

    public void setCinema_status(String cinema_status) {
        this.cinema_status = cinema_status;
    }

    public int getRerun_times() {
        return rerun_times;
    }

    public void setRerun_times(int rerun_times) {
        this.rerun_times = rerun_times;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(long cinema_id) {
        this.cinema_id = cinema_id;
    }

    public String getCinema_ext_id() {
        return cinema_ext_id;
    }

    public void setCinema_ext_id(String cinema_ext_id) {
        this.cinema_ext_id = cinema_ext_id;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public void setCinema_name(String cinema_name) {
        this.cinema_name = cinema_name;
    }

    public long getRegion_id() {
        return region_id;
    }

    public void setRegion_id(long region_id) {
        this.region_id = region_id;
    }

    public String getRegion_ext_id() {
        return region_ext_id;
    }

    public void setRegion_ext_id(String region_ext_id) {
        this.region_ext_id = region_ext_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public Timestamp getStore_date() {
        return store_date;
    }

    public void setStore_date(Timestamp store_date) {
        this.store_date = store_date;
    }
}
