package com.ticketnew.qe.api.seat;

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
 * @since 2017/4/26
 */
@FreeBuilder
public interface SeatAPI extends BasicAPI {

    Optional<String> sessionId();

    Optional<Long> scheduleId();

    Optional<String> areaId();

    Optional<String> seats();

    Optional<String> lockId();

    Optional<Integer> lockCount();

    enum SeatAPIEnum {
        Get_SEATS("Get_SEATS", "ticketnew.app.seat.getSeats"),
        GET_SOLD_SEATS("GET_SOLD_SEATS", "ticketnew.app.seat.getSoldSeats"),
        LOCK_SEAT("LOCK_SEAT", "ticketnew.app.seat.lockSeat"),
        AUTO_LOCK_SEAT("AUTO_LOCK_SEAT", "ticketnew.app.seat.autoLockSeat"),
        UNLOCK_SEAT("UNLOCK_SEAT", "ticketnew.app.seat.unlockSeat");

        private String SeatType;
        private String apiName;

        SeatAPIEnum(String SeatType, String apiName) {
            this.SeatType = SeatType;
            this.apiName = apiName;
        }

        public String getApiName() {
            return this.apiName;
        }

        public String getSeatType() {
            return this.SeatType;
        }

    }

    class Builder extends SeatAPI_Builder {

        private Map<String, String> params = new HashMap<>();
        private String api = null;
        private HttpRequestUtil httpRequestUtil = new HttpRequestUtil();

        public CsbResponse getSeats() {
            addParams();
            api = SeatAPIEnum.Get_SEATS.getApiName();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse getSoldSeats() {
            addParams();
            api = SeatAPIEnum.GET_SOLD_SEATS.getApiName();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse lockSeat() {
            addParams();
            api = SeatAPIEnum.LOCK_SEAT.getApiName();
            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse autoLockSeat() {
            addParams();
            api = SeatAPIEnum.AUTO_LOCK_SEAT.getApiName();
            return httpRequestUtil.doPost(api, params);
        }

        public CsbResponse unlockSeat() {
            addParams();
            api = SeatAPIEnum.UNLOCK_SEAT.getApiName();
            return httpRequestUtil.doPost(api, params);
        }

        public void addParams() {
            if (sessionId().isPresent()) {
                params.put("sessionId", sessionId().get());
            }

            if (scheduleId().isPresent()) {
                params.put("scheduleId", String.valueOf(scheduleId().get()));
            }

            if (areaId().isPresent() && areaId().get() != null) {
                params.put("areaId", areaId().get());
            }

            if (seats().isPresent()) {
                params.put("seats", seats().get());
            }

            if (lockId().isPresent()) {
                params.put("lockId", lockId().get());
            }

            if (lockCount().isPresent()) {
                params.put("lockCount", String.valueOf(lockCount().get()));
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
