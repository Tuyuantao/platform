package com.ticketnew.qe.api.entity;

import java.util.List;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/27
 */
public class Row {

    private String id;
    private String name;
    private List<Seat> seats;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
