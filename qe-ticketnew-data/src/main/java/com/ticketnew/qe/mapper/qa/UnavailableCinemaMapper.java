package com.ticketnew.qe.mapper.qa;

import java.util.List;
import java.util.Map;

import com.ticketnew.qe.dto.CinemaCountByDateDTO;
import com.ticketnew.qe.dto.CinemaCountByNameDTO;
import com.ticketnew.qe.dto.UnavailableCinemaDTO;
import org.apache.ibatis.annotations.Param;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/13
 */
public interface UnavailableCinemaMapper {

    /**
     * select all data from database
     * @return
     */
    List<UnavailableCinemaDTO> selectAll();

    /**
     * select data by date
     * @param date
     * @return
     */
    List<UnavailableCinemaDTO> selectByDate(@Param("date") String date);

    /**
     * select data by cinema name
     * @param date
     * @return
     */
    List<UnavailableCinemaDTO> selectByCinemaName(@Param("cinemaName") String cinemaName);

    /**
     * select count group by name
     * @param number
     * @return
     */
    List<CinemaCountByNameDTO> getCountGroupByName(@Param("number") int number);

    /**
     * select count group by date
     * @param number
     * @return
     */
    List<CinemaCountByDateDTO> getCountGroupByDate(@Param("number") int number);
}
