package com.ticketnew.qe.api.seat;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/5/24
 */
public enum  SeatTypeEnum {

    NORMAL("N"),
    TWIN("T"),
    SPECIAL("S"),
    PASSAGE("P"),
    ;

    private String value;

    public String getValue() {
        return value;
    }

    private SeatTypeEnum(String value) {
        this.value = value;
    }
}
