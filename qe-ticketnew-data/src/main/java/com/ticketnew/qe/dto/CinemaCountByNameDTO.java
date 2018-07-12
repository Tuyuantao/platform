package com.ticketnew.qe.dto;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/13
 */
public class CinemaCountByNameDTO implements BasicDTO {

    private String cinemaName;
    private int number;

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CinemaCountByNameDTO{" +
            "cinemaName='" + cinemaName + '\'' +
            ", number=" + number +
            '}';
    }
}
