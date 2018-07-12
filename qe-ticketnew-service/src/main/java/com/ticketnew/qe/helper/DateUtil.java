package com.ticketnew.qe.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/17
 */
public class DateUtil {

    public static String formatDate(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) {
        System.out.println(formatDate(new Date(), "yyyy-MM-dd HH:mm"));
    }
}
