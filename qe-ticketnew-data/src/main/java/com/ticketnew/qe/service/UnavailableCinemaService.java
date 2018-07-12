package com.ticketnew.qe.service;

import java.util.List;

import com.ticketnew.qe.dto.CinemaCountByDateDTO;
import com.ticketnew.qe.dto.CinemaCountByNameDTO;
import com.ticketnew.qe.dto.UnavailableCinemaDTO;
import org.apache.ibatis.annotations.Param;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/13
 */
public interface UnavailableCinemaService {

    /**
     * get cinema count group by name
     * @return
     */
    List<CinemaCountByNameDTO> getCountGroupByName(int number);

    /**
     * get cinema count group by name
     * @return
     */
    List<CinemaCountByDateDTO> getCountGroupByDate(int number);

    /**
     * get data by date
     * @param date
     * @return
     */
    List<UnavailableCinemaDTO> getDataByDate(String date, Integer number, Integer pageIndex);

    /**
     * get data by cinema name
     * @param cinemaName
     * @return
     */
    List<UnavailableCinemaDTO> getDataByCinemaName(String cinemaName);
}
