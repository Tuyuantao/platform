package com.ticketnew.qe.impl;

import java.util.List;

import com.ticketnew.qe.dto.CinemaCountByDateDTO;
import com.ticketnew.qe.dto.CinemaCountByNameDTO;
import com.ticketnew.qe.dto.UnavailableCinemaDTO;
import com.ticketnew.qe.mapper.qa.UnavailableCinemaMapper;
import com.ticketnew.qe.service.UnavailableCinemaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/13
 */
public class UnavailableCinemaServiceImpl implements UnavailableCinemaService {

    private final Logger logger = LoggerFactory.getLogger(UnavailableCinemaServiceImpl.class);
    @Autowired
    UnavailableCinemaMapper mapper;

    @Override
    public List<CinemaCountByNameDTO> getCountGroupByName(int number) {
        List<CinemaCountByNameDTO> cinemaCountByNameDTOS = mapper.getCountGroupByName(number);
        logger.info(cinemaCountByNameDTOS.toString());
        return cinemaCountByNameDTOS;
    }

    @Override
    public List<CinemaCountByDateDTO> getCountGroupByDate(int number) {
        List<CinemaCountByDateDTO> cinemaCountByDateDTOS = mapper.getCountGroupByDate(number);
        logger.info(cinemaCountByDateDTOS.toString());
        return cinemaCountByDateDTOS;
    }

    @Override
    public List<UnavailableCinemaDTO> getDataByDate(String date, Integer number, Integer pageIndex) {
        List<UnavailableCinemaDTO> unavailableCinemaDTOS = mapper.selectByDate(date);
        logger.info(unavailableCinemaDTOS.toString());
        return unavailableCinemaDTOS;
    }

    @Override
    public List<UnavailableCinemaDTO> getDataByCinemaName(String cinemaName) {
        List<UnavailableCinemaDTO> unavailableCinemaDTOS = mapper.selectByCinemaName(cinemaName);
        logger.info(unavailableCinemaDTOS.toString());
        return unavailableCinemaDTOS;
    }

}
