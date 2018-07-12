package com.ticketnew.qe.api.promotion;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ticketnew.qe.api.csb.Body;
import com.ticketnew.qe.api.csb.CsbResponse;
import com.ticketnew.qe.api.entity.Promotion;
import com.ticketnew.qe.api.entity.UserProfile;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/5/18
 */
public class PromotionUtil {
    private static Gson gson = new Gson();

    public static int getTicketPrice(Body body) {
        int feeNumbers = body.get("data.ticket.feeDetails.length()");

        int price = 0;
        int number = 0;

        for(int i =0; i<feeNumbers; i++) {
            String name = body.get("data.ticket.feeDetails[" + i + "].name");
            if(name.toLowerCase().contains("ticket")) {
                price = body.get("data.ticket.feeDetails[" + i + "].fee");
                number = body.get("data.ticket.feeDetails[" + i + "].quantity");
                break;
            }
        }
        return price * number;
    }

    /**
     * check promotion code
     * @param userProfile
     * @param lockId
     * @param promotionCode
     * @return promotion entity
     */
    public static Promotion isValid(UserProfile userProfile, String lockId, String promotionCode) {
        CsbResponse csbResponse = new PromotionAPI.Builder()
                .sessionId(userProfile.getSession())
                .lockId(lockId)
                .couponCode(promotionCode)
                .validateCoupon();
        if(csbResponse.isValid()) {
            try {
                return gson.fromJson(csbResponse.getBody().getData().toString(), new TypeToken<Promotion>(){}.getType());
            } catch (Exception e) {
                return null;
            }
        }

        return null;

    }
}
