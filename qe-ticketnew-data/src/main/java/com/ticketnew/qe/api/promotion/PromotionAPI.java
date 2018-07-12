package com.ticketnew.qe.api.promotion;

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
 * @since 2017/5/2
 */
@FreeBuilder
public interface PromotionAPI extends BasicAPI {

    Optional<String> sessionId();

    Optional<String> couponCode();

    Optional<String> lockId();

    Optional<Long> id();

    Optional<Long> startTime();

    Optional<Long> endTime();

    Optional<String> name();

    Optional<String> type();

    Optional<String> status();

    Optional<String> mobile();

    Optional<String> historyStrategy();

    Optional<String> serviceCode();

    Optional<String> userName();

    Optional<String> rewardRecordId();

    Optional<String> lotteryName();

    Optional<Integer> pageSize();

    Optional<Long> cinemaId();

    Optional<Long> movieId();

    Optional<Long> regionId();

    Optional<Integer> pageIndex();

    enum PromotionAPIEnum {
        VALIDATE_COUPON("VALIDATE_COUPON", "ticketnew.app.promotion.validateCoupon"),
        GET_VALID_PROMOTION("GET_VALID_PROMOTION", "ticketnew.app.promotion.getValidPromotion"),
        DRAW_LOTTERY("DRAW_LOTTERY", "ticketnew.app.promotion.lottery.draw"),
        GET_USER_REMAINS("GET_USER_REMAINS", "ticketnew.app.promotion.lottery.getUserRemains"),
        UPDATE_REWARD("UPDATE_REWARD", "ticketnew.app.promotion.lottery.updateReward"),
        SMS("SMS", "ticketnew.app.promotion.sms"),
        GET_USER_REWARD_HISTORY("GET_USER_REWARD_HISTORY", "ticketnew.app.promotion.lottery.getUserRewardHistory"),
        GET_LOTTERY_HISTORY("GET_LOTTERY_HISTORY", "ticketnew.app.promotion.lottery.getLotteryHistory"),
        GET_PROMOTION_DETAIL("GET_PROMOTION_DETAIL", "ticketnew.app.promotion.getPromotionDetail"),
        GET_PROMOTION_LIST("GET_PROMOTION_LIST", "ticketnew.app.promotion.getPromotionList"),;

        private String promotionType;
        private String apiName;

        PromotionAPIEnum(String promotionType, String apiName) {
            this.promotionType = promotionType;
            this.apiName = apiName;
        }

        public String getApiName() {
            return this.apiName;
        }

        public String getPromotionType() {
            return this.promotionType;
        }
    }

    class Builder extends PromotionAPI_Builder {

        private Map<String, String> params = new HashMap<>();
        private String api = null;
        private HttpRequestUtil httpRequestUtil = new HttpRequestUtil();

        public CsbResponse validateCoupon() {
            api = PromotionAPIEnum.VALIDATE_COUPON.getApiName();
            addParams();
            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse getValidatePromotion() {
            api = PromotionAPIEnum.GET_VALID_PROMOTION.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse drawLottery() {
            api = PromotionAPIEnum.DRAW_LOTTERY.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse getUserRemains() {
            api = PromotionAPIEnum.GET_USER_REMAINS.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse updateReward() {
            api = PromotionAPIEnum.UPDATE_REWARD.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse getUserRewardHistory() {
            api = PromotionAPIEnum.GET_USER_REWARD_HISTORY.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse getLotteryHistory() {
            api = PromotionAPIEnum.GET_LOTTERY_HISTORY.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse sendMessage() {
            api = PromotionAPIEnum.SMS.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse getPromotionList() {
            api = PromotionAPIEnum.GET_PROMOTION_LIST.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse getPromotionDetail() {
            api = PromotionAPIEnum.GET_PROMOTION_DETAIL.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public void addParams() {
            if (sessionId().isPresent()) {
                params.put("sessionId", sessionId().get());
            }

            if (couponCode().isPresent()) {
                params.put("couponCode", couponCode().get());
            }

            if (lockId().isPresent()) {
                params.put("lockId", lockId().get());
            }

            if (id().isPresent()) {
                params.put("id", String.valueOf(id().get()));
            }

            if (startTime().isPresent()) {
                params.put("startTime", String.valueOf(startTime().get()));
            }

            if (endTime().isPresent()) {
                params.put("endTime", String.valueOf(endTime().get()));
            }

            if (name().isPresent()) {
                params.put("name", name().get());
            }

            if (type().isPresent()) {
                params.put("type", type().get());
            }

            if (status().isPresent()) {
                params.put("status", status().get());
            }

            if (mobile().isPresent()) {
                params.put("mobile", mobile().get());
            }

            if (historyStrategy().isPresent()) {
                params.put("historyStrategy", historyStrategy().get());
            }

            if (serviceCode().isPresent()) {
                params.put("serviceCode", serviceCode().get());
            }

            if (userName().isPresent()) {
                params.put("userName", userName().get());
            }

            if (rewardRecordId().isPresent()) {
                params.put("rewardRecordId", rewardRecordId().get());
            }

            if (lotteryName().isPresent()) {
                params.put("lotteryName", lotteryName().get());
            }

            if (pageSize().isPresent()) {
                params.put("pageSize", String.valueOf(pageSize().get()));
            }

            if (cinemaId().isPresent()) {
                params.put("cinemaId", String.valueOf(cinemaId().get()));
            }

            if (movieId().isPresent()) {
                params.put("movieId", String.valueOf(movieId().get()));
            }

            if (regionId().isPresent()) {
                params.put("regionId", String.valueOf(regionId().get()));
            }

            if (pageIndex().isPresent()) {
                params.put("pageIndex", String.valueOf(pageIndex().get()));
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
