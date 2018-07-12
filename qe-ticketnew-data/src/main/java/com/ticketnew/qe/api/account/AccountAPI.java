package com.ticketnew.qe.api.account;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.ticketnew.qe.api.BasicAPI;
import com.ticketnew.qe.api.csb.CsbResponse;
import com.ticketnew.qe.api.csb.HttpRequestUtil;
import org.inferred.freebuilder.FreeBuilder;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/20
 */

@FreeBuilder
public interface AccountAPI extends BasicAPI {
    Optional<String> loginType();

    Optional<String> mobile();

    Optional<String> email();

    Optional<String> password();

    Optional<String> verificationCode();

    Optional<String> userId();

    Optional<String> token();

    Optional<String> session();

    Optional<String> thirdUserId();

    Optional<String> thirdUserType();

    Optional<String> thirdEmail();

    Optional<String> thirdUserName();

    Optional<String> regionId();

    Optional<String> sessionId();

    Optional<Integer> verifyType();

    Optional<String> firebaseToken();

    Optional<Integer> pageSize();

    Optional<Integer> pageIndex();

    Optional<Long> userMessageId();

    Optional<Long> cinemaId();

    Optional<Boolean> favorite();

    Builder toBuilder();

    enum AccountTypeEnum {

        ACCOUNT_LOGIN("NORMAL", "ticketnew.app.account.login"),
        OTP_LOGIN("OTP", "ticketnew.app.account.otpLogin"),
        THIRD_LOGIN("THIRD", "ticketnew.app.account.thirdLogin"),
        TOKEN_LOGIN("TOKEN", "ticketnew.app.account.tokenLogin"),
        CHANGE_PASSWORD("CHANGE PASSWORD", "ticketnew.app.account.changePassword"),
        REGISTER("REGISTER", "ticketnew.app.account.register"),
        BIND_EMAIL("BIND_EMAIL", "ticketnew.app.account.bindEmail"),
        SEND_VERIFICATION_CODE("SEND_VERIFICATION_CODE", "ticketnew.app.account.sendVerificationCode"),
        VERIFY_CODE("VERIFY_CODE", "ticketnew.app.account.verifyCode"),
        EDIT_PROFILE("EDIT_PROFILE", " ticketnew.app.account.editProfile"),
        GET_PROFILE_BY_SESSION("GET_PROFILE_BY_SESSION", " ticketnew.app.account.getProfileBySession"),
        BIND_MOBILE("BIND_MOBILE", "ticketnew.app.account.bindMobile"),
        BIND_THIRD("BIND_MOBILE", "ticketnew.app.account.bindThird"),
        UNBIND_THIRD("UNBIND_MOBILE", "ticketnew.app.account.unbindThird"),
        FEEDBACK("FEEDBACK", "ticketnew.app.account.feedback"),
        LIST_MESSAGE("LIST_MESSAGE", "ticketnew.app.account.listMessage"),
        READ_MESSAGE("READ_MESSAGE", "ticketnew.app.account.readMessage"),
        CINEMA_FAVORITE("CINEMA_FAVORITE", "ticketnew.app.account.cinemaFavorite"),
        CHECK_ACCOUNT("CHECK_ACCOUNT", "ticketnew.app.account.checkAccount"),;

        private String loginType;
        private String apiName;

        AccountTypeEnum(String loginType, String apiName) {
            this.loginType = loginType;
            this.apiName = apiName;
        }

        public String getApiName() {
            return this.apiName;
        }

        public String getLoginType() {
            return this.loginType;
        }

        public static AccountTypeEnum findLoginType(String loginType) {
            for (AccountTypeEnum accountTypeEnum : AccountTypeEnum.values()) {
                if (accountTypeEnum.getLoginType().equals(loginType.toUpperCase())) {
                    return accountTypeEnum;
                }
            }
            return null;
        }
    }

    class Builder extends AccountAPI_Builder {

        private Map<String, String> params = new HashMap<>();
        private String api = null;
        private HttpRequestUtil httpRequestUtil = new HttpRequestUtil();

        public CsbResponse login() {

            if (!loginType().isPresent()) {
                throw new RuntimeException("login type can't be empty!");
            } else {
                params.put("loginType", loginType().get());
                api = AccountTypeEnum.findLoginType(loginType().get()).getApiName();
            }

            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse register() {

            api = AccountTypeEnum.REGISTER.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse changePassword() {

            api = AccountTypeEnum.CHANGE_PASSWORD.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse sendVerificationCode() {

            api = AccountTypeEnum.SEND_VERIFICATION_CODE.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse verifyCode() {

            api = AccountTypeEnum.VERIFY_CODE.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse editProfile() {

            api = AccountTypeEnum.EDIT_PROFILE.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse getProfileBySession() {

            api = AccountTypeEnum.GET_PROFILE_BY_SESSION.getApiName();
            addParams();

            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse bindEmail() {

            api = AccountTypeEnum.BIND_EMAIL.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse bindMobile() {

            api = AccountTypeEnum.BIND_MOBILE.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse bindThird() {

            api = AccountTypeEnum.BIND_THIRD.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse unbindThird() {

            api = AccountTypeEnum.UNBIND_THIRD.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse feedBack() {

            api = AccountTypeEnum.FEEDBACK.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse listMessage() {

            api = AccountTypeEnum.LIST_MESSAGE.getApiName();
            addParams();

            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse readMessage() {

            api = AccountTypeEnum.READ_MESSAGE.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse cinemaFavorite() {

            api = AccountTypeEnum.CINEMA_FAVORITE.getApiName();
            addParams();

            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse checkAccount() {
            api = AccountTypeEnum.CHECK_ACCOUNT.getApiName();
            addParams();

            return httpRequestUtil.doGet(api, params);
        }

        private void addParams() {

            if (loginType().isPresent()) {
                params.put("loginType", loginType().get());
            }

            if (mobile().isPresent()) {
                params.put("mobile", mobile().get());
            }

            if (email().isPresent()) {
                params.put("email", email().get());
            }

            if (password().isPresent()) {
                params.put("password", password().get());
            }

            if (verificationCode().isPresent()) {
                params.put("verificationCode", verificationCode().get());
            }

            if (userId().isPresent()) {
                params.put("userId", userId().get());
            }

            if (token().isPresent()) {
                params.put("token", token().get());
            }

            if (session().isPresent()) {
                params.put("session", session().get());
            }

            if (thirdUserId().isPresent()) {
                params.put("thirdUserId", thirdUserId().get());
            }

            if (thirdUserType().isPresent()) {
                params.put("thirdUserType", thirdUserType().get());
            }

            if (thirdEmail().isPresent()) {
                params.put("thirdEmail", thirdEmail().get());
            }

            if (regionId().isPresent()) {
                params.put("regionId", regionId().get());
            }

            if (verifyType().isPresent()) {
                params.put("verifyType", String.valueOf(verifyType().get()));
            }

            if (thirdUserName().isPresent()) {
                params.put("thirdUserName", thirdUserName().get());
            }

            if (firebaseToken().isPresent()) {
                params.put("firebaseToken", firebaseToken().get());
            }

            if (sessionId().isPresent()) {
                params.put("sessionId", sessionId().get());
            }

            if (pageIndex().isPresent()) {
                params.put("pageIndex", String.valueOf(pageIndex().get()));
            }

            if (pageSize().isPresent()) {
                params.put("pageSize", String.valueOf(pageSize().get()));
            }

            if (userMessageId().isPresent()) {
                params.put("userMessageId", String.valueOf(userMessageId().get()));
            }

            if (cinemaId().isPresent()) {
                params.put("cinemaId", String.valueOf(cinemaId().get()));
            }

            if (favorite().isPresent()) {
                params.put("favorite", String.valueOf(favorite().get()));
            }

            if (appPlatform().isPresent()) {
                params.put("appPlatform", appPlatform().get());
            }

            if (appChannel().isPresent()) {
                params.put("appChannel", appChannel().get());
            }

            if (appVersion().isPresent()) {
                params.put("appVersion", appVersion().get());
            }

            if (appDevice().isPresent()) {
                params.put("appDevice", appDevice().get());
            }

            if (appEnv().isPresent()) {
                params.put("appEnv", appEnv().get());
            }
        }
    }
}
