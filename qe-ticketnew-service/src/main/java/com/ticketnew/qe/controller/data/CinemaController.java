package com.ticketnew.qe.controller.data;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.ticketnew.qe.dto.CinemaCountByDateDTO;
import com.ticketnew.qe.dto.CinemaCountByNameDTO;
import com.ticketnew.qe.dto.UnavailableCinemaDTO;
import com.ticketnew.qe.helper.DateUtil;
import com.ticketnew.qe.service.UnavailableCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/13
 */
@RestController
@RequestMapping("/cinema")
public class CinemaController {

    @Autowired
    UnavailableCinemaService unavailableCinemaService;

    /**
     * get data group by name
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path = "/name")
    public List<CinemaCountByNameDTO> getCinemaCountByName(@RequestParam(value = "number") int number) {
        List<CinemaCountByNameDTO> cinemaCountByNameDTOS = unavailableCinemaService.getCountGroupByName(number);
        return cinemaCountByNameDTOS;
    }

    /**
     * get data group by name
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path = "/date")
    public List<CinemaCountByNameDTO> getCinemaCountByDate(@RequestParam(value = "number") int number) {
        List<CinemaCountByDateDTO> cinemaNameCountDTOS = unavailableCinemaService.getCountGroupByDate(number);
        return cinemaNameCountDTOS.stream().map(cinemaCountByDateDTO -> {
            CinemaCountByNameDTO cinemaCountByNameDTO = new CinemaCountByNameDTO();
            Date date = new Date(cinemaCountByDateDTO.getDate().getTime());
            cinemaCountByNameDTO.setCinemaName(DateUtil.formatDate(date, "yyyy-MM-dd HH:mm"));
            cinemaCountByNameDTO.setNumber(cinemaCountByDateDTO.getNumber());
            return cinemaCountByNameDTO;
        }).collect(Collectors.toList());
    }

    /**
     * get specific date data
     * @param date
     * @param number
     * @param pageIndex
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path = "/date/{date}")
    public List<UnavailableCinemaDTO> getSpecificDateCinemaData(@PathVariable(name = "date") String date,
                                                                 @RequestParam(value = "number", required = false) Integer number,
                                                                 @RequestParam(value = "pageIndex", required = false) Integer pageIndex) {
        List<UnavailableCinemaDTO> cinemaDTOS = unavailableCinemaService.getDataByDate(date, number, pageIndex);
        return cinemaDTOS;
    }

    /**
     * get specific cinema data
     * @param name
     * @param number
     * @param pageIndex
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path = "/name/{name}")
    public List<UnavailableCinemaDTO> getSpecificCinemaDate(@PathVariable(name = "name") String name,
                                                                 @RequestParam(value = "number", required = false) Integer number,
                                                                 @RequestParam(value = "pageIndex", required = false) Integer pageIndex) {
        List<UnavailableCinemaDTO> cinemaDTOS = unavailableCinemaService.getDataByCinemaName(name);
        return cinemaDTOS;
    }
}
