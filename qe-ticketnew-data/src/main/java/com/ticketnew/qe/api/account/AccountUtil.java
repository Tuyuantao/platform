package com.ticketnew.qe.api.account;

import com.google.gson.Gson;
import com.ticketnew.qe.api.csb.CsbResponse;
import com.ticketnew.qe.api.entity.Account;
import com.ticketnew.qe.api.entity.UserProfile;
import com.ticketnew.qe.api.util.StringUtils;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/27
 */
public class AccountUtil {

    private static final String CODE = "1024";
    private static Gson gson = new Gson();

    public static Account createAccountWithMobile() {
        String mobile = StringUtils.generateNumber(10, 9);
        CsbResponse csbResponse = new AccountAPI.Builder().mobile(mobile).verificationCode(CODE).register();
        if (csbResponse.isValid()) {
            Account account = new Account();
            account.setMobile(mobile);
            return account;
        }
        return null;
    }

    public static UserProfile getUserProfileByMobile(String mobile) {
        CsbResponse csbResponse = new AccountAPI.Builder()
                .loginType(AccountAPI.AccountTypeEnum.OTP_LOGIN.getLoginType())
                .mobile(mobile)
                .verificationCode(CODE)
                .login();
        if (csbResponse.isValid()) {
            String profileJson = csbResponse.getBody().getData().getAsJsonObject().get("userProfileDTO").toString();
            return gson.fromJson(profileJson, UserProfile.class);
        }

        return null;
    }

    public static UserProfile getUserProfileByMobile(String mobile, String password) {
        CsbResponse csbResponse = new AccountAPI.Builder()
                .loginType(AccountAPI.AccountTypeEnum.ACCOUNT_LOGIN.getLoginType())
                .mobile(mobile)
                .password(password)
                .login();
        if (csbResponse.isValid()) {
            String profileJson = csbResponse.getBody().getData().getAsJsonObject().get("userProfileDTO").toString();
            return gson.fromJson(profileJson, UserProfile.class);
        }
        return null;
    }

    public static String getSessionIdByMobile(String mobile) {
        UserProfile userProfile = getUserProfileByMobile(mobile);
        if(userProfile != null) {
            return userProfile.getSession();
        }

        return null;
    }

    public static String getSessionIdByMobile(String mobile, String password) {
        UserProfile userProfile = getUserProfileByMobile(mobile, password);
        if(userProfile != null) {
            return userProfile.getSession();
        }

        return null;
    }

    public static UserProfile transferToEntity(CsbResponse csbResponse) {
        if(csbResponse != null && csbResponse.isValid()) {
            String profileJson = csbResponse.getBody().getData().getAsJsonObject().get("userProfileDTO").toString();
            return gson.fromJson(profileJson, UserProfile.class);
        }

        return null;
    }
}
