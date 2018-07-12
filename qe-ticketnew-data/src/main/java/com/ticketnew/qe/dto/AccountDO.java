package com.ticketnew.qe.dto;

import java.sql.Date;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/15
 */
public class AccountDO implements BasicDTO{

    private long id;
    private Date gmt_create;
    private Date gmt_modified;
    private String user_id;
    private String ext_user_id;
    private String password;
    private String token;
    private String mobile;
    private String trade_mobile;
    private int mobile_verified;
    private String email;
    private String trade_email;
    private int email_verified;
    private String avatar_url;
    private String last_name;
    private String first_name;
    private String nick_name;
    private Long birth_date;
    private String address1;
    private String address2;
    private String city;
    private String postcode;
    private String state;
    private int gender;
    private String google_email;
    private String google_user_id;
    private String google_user_name;
    private String facebook_email;
    private String facebook_user_id;
    private String facebook_user_name;
    private String source;
    private Date register_time;
    private String register_region_id;
    private String register_source;
    private int is_new;
    private int push_switch;
    private String firebase_token;
    private String last_login_device;
    private String device_id;
    private String platform;
    private String channel;
    private String version;
    private String env;
    private Date last_booked_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getExt_user_id() {
        return ext_user_id;
    }

    public void setExt_user_id(String ext_user_id) {
        this.ext_user_id = ext_user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTrade_mobile() {
        return trade_mobile;
    }

    public void setTrade_mobile(String trade_mobile) {
        this.trade_mobile = trade_mobile;
    }

    public int getMobile_verified() {
        return mobile_verified;
    }

    public void setMobile_verified(int mobile_verified) {
        this.mobile_verified = mobile_verified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrade_email() {
        return trade_email;
    }

    public void setTrade_email(String trade_email) {
        this.trade_email = trade_email;
    }

    public int getEmail_verified() {
        return email_verified;
    }

    public void setEmail_verified(int email_verified) {
        this.email_verified = email_verified;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public Long getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Long birth_date) {
        this.birth_date = birth_date;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getGoogle_email() {
        return google_email;
    }

    public void setGoogle_email(String google_email) {
        this.google_email = google_email;
    }

    public String getGoogle_user_id() {
        return google_user_id;
    }

    public void setGoogle_user_id(String google_user_id) {
        this.google_user_id = google_user_id;
    }

    public String getGoogle_user_name() {
        return google_user_name;
    }

    public void setGoogle_user_name(String google_user_name) {
        this.google_user_name = google_user_name;
    }

    public String getFacebook_email() {
        return facebook_email;
    }

    public void setFacebook_email(String facebook_email) {
        this.facebook_email = facebook_email;
    }

    public String getFacebook_user_id() {
        return facebook_user_id;
    }

    public void setFacebook_user_id(String facebook_user_id) {
        this.facebook_user_id = facebook_user_id;
    }

    public String getFacebook_user_name() {
        return facebook_user_name;
    }

    public void setFacebook_user_name(String facebook_user_name) {
        this.facebook_user_name = facebook_user_name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getRegister_time() {
        return register_time;
    }

    public void setRegister_time(Date register_time) {
        this.register_time = register_time;
    }

    public String getRegister_region_id() {
        return register_region_id;
    }

    public void setRegister_region_id(String register_region_id) {
        this.register_region_id = register_region_id;
    }

    public String getRegister_source() {
        return register_source;
    }

    public void setRegister_source(String register_source) {
        this.register_source = register_source;
    }

    public int getIs_new() {
        return is_new;
    }

    public void setIs_new(int is_new) {
        this.is_new = is_new;
    }

    public int getPush_switch() {
        return push_switch;
    }

    public void setPush_switch(int push_switch) {
        this.push_switch = push_switch;
    }

    public String getFirebase_token() {
        return firebase_token;
    }

    public void setFirebase_token(String firebase_token) {
        this.firebase_token = firebase_token;
    }

    public String getLast_login_device() {
        return last_login_device;
    }

    public void setLast_login_device(String last_login_device) {
        this.last_login_device = last_login_device;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public Date getLast_booked_date() {
        return last_booked_date;
    }

    public void setLast_booked_date(Date last_booked_date) {
        this.last_booked_date = last_booked_date;
    }

    @Override
    public String toString() {
        return "AccountDO{" +
            "id=" + id +
            ", gmt_create=" + gmt_create +
            ", gmt_modified=" + gmt_modified +
            ", user_id='" + user_id + '\'' +
            ", ext_user_id='" + ext_user_id + '\'' +
            ", password='" + password + '\'' +
            ", token='" + token + '\'' +
            ", mobile='" + mobile + '\'' +
            ", trade_mobile='" + trade_mobile + '\'' +
            ", mobile_verified=" + mobile_verified +
            ", email='" + email + '\'' +
            ", trade_email='" + trade_email + '\'' +
            ", email_verified=" + email_verified +
            ", avatar_url='" + avatar_url + '\'' +
            ", last_name='" + last_name + '\'' +
            ", first_name='" + first_name + '\'' +
            ", nick_name='" + nick_name + '\'' +
            ", birth_date=" + birth_date +
            ", address1='" + address1 + '\'' +
            ", address2='" + address2 + '\'' +
            ", city='" + city + '\'' +
            ", postcode='" + postcode + '\'' +
            ", state='" + state + '\'' +
            ", gender=" + gender +
            ", google_email='" + google_email + '\'' +
            ", google_user_id='" + google_user_id + '\'' +
            ", google_user_name='" + google_user_name + '\'' +
            ", facebook_email='" + facebook_email + '\'' +
            ", facebook_user_id='" + facebook_user_id + '\'' +
            ", facebook_user_name='" + facebook_user_name + '\'' +
            ", source='" + source + '\'' +
            ", register_time=" + register_time +
            ", register_region_id='" + register_region_id + '\'' +
            ", register_source='" + register_source + '\'' +
            ", is_new=" + is_new +
            ", push_switch=" + push_switch +
            ", firebase_token='" + firebase_token + '\'' +
            ", last_login_device='" + last_login_device + '\'' +
            ", device_id='" + device_id + '\'' +
            ", platform='" + platform + '\'' +
            ", channel='" + channel + '\'' +
            ", version='" + version + '\'' +
            ", env='" + env + '\'' +
            ", last_booked_date=" + last_booked_date +
            '}';
    }
}
