package com.ticketnew.qe.dto;

import java.sql.Timestamp;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/17
 */
public class CinemaCountByDateDTO implements BasicDTO {

    private Timestamp date;
    private int number;

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CinemaCountByDateDTO{" +
            "date=" + date +
            ", number=" + number +
            '}';
    }
}
