package com.ticketnew.qe.api.seat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ticketnew.qe.api.csb.Body;
import com.ticketnew.qe.api.csb.CsbResponse;
import com.ticketnew.qe.api.entity.Area;
import com.ticketnew.qe.api.entity.Row;
import com.ticketnew.qe.api.entity.Seat;
import com.ticketnew.qe.api.resultCode.BaseDataResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/27
 */
public class SeatUtil {
    private static final Logger logger = LoggerFactory.getLogger(SeatUtil.class);

    public static List<Area> getSeats(Long scheduleId, String areaId) {
        CsbResponse csbResponse = new SeatAPI.Builder().areaId(Optional.ofNullable(areaId)).scheduleId(scheduleId)
            .getSeats();
        if (!csbResponse.isValid()) {
            return null;
        }
        Body body = csbResponse.getBody();
        String jsonAreas = body.getData().getAsJsonObject().getAsJsonArray("areas").toString();
        Gson gson = new Gson();
        List<Area> areas = gson.fromJson(jsonAreas, new TypeToken<List<Area>>() {
        }.getType());
        return areas;
    }

    public static String seatErrorInfo(Long scheduleId, String areaId) {
        CsbResponse csbResponse = new SeatAPI.Builder().areaId(Optional.ofNullable(areaId)).scheduleId(scheduleId)
            .getSeats();
        if (!csbResponse.isValid()) {
            if (csbResponse.getBody() == null) {
                return null;
            }

            for (BaseDataResultCode baseDataResultCode : BaseDataResultCode.values()) {
                if (baseDataResultCode.getCode().equalsIgnoreCase(csbResponse.getBody().getResultCode())) {
                    return baseDataResultCode.name() + "(" + csbResponse.getBody().getResultCode() + ":" + csbResponse
                        .getBody().getResultMessage() + ")";
                }
            }
            return csbResponse.getBody().getResultCode() + ":" + csbResponse.getBody().getResultMessage();
        }

        return null;
    }

    public static List<Area> getAvailSeats(Long scheduleId, String areaId) {
        List<Area> areas = getSeats(scheduleId, areaId);
        if (areas == null || areas.size() <= 0) {
            return areas;
        }

        for (Area area : areas) {
            List<String> soldSeats = area.getSoldSeatIds();
            for (Row row : area.getRows()) {
                List<Seat> seats = row.getSeats();
                Iterator<Seat> seatIterator = seats.iterator();

                if (seats == null || seats.size() <= 0) {
                    continue;
                }

                while (seatIterator.hasNext()) {
                    Seat seat = seatIterator.next();
                    if (soldSeats.contains(seat.getExtId()) || seat.getType().equalsIgnoreCase(
                        SeatTypeEnum.PASSAGE.getValue())) {
                        seatIterator.remove();
                    }
                }
            }
        }
        return areas;
    }

    public static Map<String, String> buildAvailSeats(Long scheduleId, String areaId, int count) {

        if (count <= 0) {
            return null;
        }
        Map<String, String> seatMap = new HashMap<>();

        List<Map<String, String>> seatsParam = new ArrayList<>();
        List<Area> areas = getAvailSeats(scheduleId, areaId);
        for (Area area : areas) {
            List<Row> rows = area.getRows();
            if (rows == null || rows.size() <= 0) {
                continue;
            }
            for (Row row : rows) {
                List<Seat> seats = row.getSeats();
                if (seats == null || seats.size() <= 0) {
                    continue;
                }
                for (Seat seat : seats) {
                    if (seatsParam.size() >= count) {
                        break;
                    }
                    Map<String, String> map = new HashMap<>();
                    map.put("extId", seat.getExtId());
                    map.put("name", seat.getName());
                    seatsParam.add(map);
                }
            }

            if (seatsParam.size() < count) {
                seatsParam = new ArrayList<>();
                logger.info("can't find " + count + " available seats in area " + area.getExtAreaId());
                continue;
            }
            String seats = new Gson().toJson(seatsParam);
            seatMap.put("areaId", area.getExtAreaId());
            seatMap.put("seats", seats);
            return seatMap;
        }

        return null;
    }


    public static synchronized String buildLockIdByManual(String sessionId, Long scheduleId, String areaId,
                                                          Integer lockCount) {
        Map<String, String> seatMap = SeatUtil.buildAvailSeats(scheduleId, areaId, lockCount);
        if (seatMap == null) {
            logger.warn("can't find available seats");
            return null;
        }
        return lockSeat(sessionId, scheduleId, seatMap.get("areaId"), seatMap.get("seats"));

    }

    public static String lockSeat(String sessionId, Long scheduleId, String areaId, String seats) {
        CsbResponse csbResponse = new SeatAPI.Builder()
            .sessionId(sessionId)
            .scheduleId(scheduleId)
            .areaId(areaId)
            .seats(seats)
            .lockSeat();
        if (!csbResponse.isValid()) {
            return null;
        }
        return csbResponse.getBody().get("data.lockId");
    }

    public static String buildLockIdByAuto(String sessionId, Long scheduleId, String areaId, Integer lockCount) {
        CsbResponse csbResponse = new SeatAPI.Builder()
            .sessionId(sessionId)
            .scheduleId(scheduleId)
            .areaId(areaId)
            .lockCount(lockCount)
            .autoLockSeat();
        if (!csbResponse.isValid()) {
            return null;
        }
        return csbResponse.getBody().get("data.lockId");
    }
}
