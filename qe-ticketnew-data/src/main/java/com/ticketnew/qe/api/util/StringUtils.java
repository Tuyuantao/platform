package com.ticketnew.qe.api.util;

import java.util.Random;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/20
 */
public class StringUtils {

    private static char[] chars = {
        '0','1','2','3','4','5','6','7','8','9',
        'A','B','C','D','E','F','G','H','I','J',
        'K','L','M','N','O','P','Q','R','S','T',
        'U','V','W','X','Y','Z','a','b','c','d',
        'e','f','g','h','i','j','k','l','m','n',
        'o','p','q','r','s','t','u','v','w','x',
        'y','z'};

    public static String generateString(int length) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(chars[random.nextInt(chars.length)]);
        }
        return builder.toString();
    }

    public static String generateNumber(int numLen, int start) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder(String.valueOf(start));
        for (int i = 0; i < numLen - 1; i++) {
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }

    public static String generateMobile() {
        Random random = new Random();
        Integer[] mobilePrefix = new Integer[]{7,8,9};
        int start = mobilePrefix[random.nextInt(3)];
        return generateNumber(10, start);
    }

    public static String generateNumber(int numLen) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numLen; i++) {
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }

    public static String arrayToString(Object[] objects, String split) {
        if (objects == null || objects.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            if(i == objects.length -1) {
                sb.append(objects[i].toString());
            } else {
                sb.append(objects[i].toString()).append(split);
            }
        }
        return sb.toString();
    }

    public static String generateEmail() {
        String suffix = "@ticketnew.com";
        return generateEmail(suffix);
    }

    public static String generateEmail(String suffix) {
        String prefix = "test_" + generateNumber(3)+ "_email_" + generateNumber(3);
        return prefix + suffix;
    }

    public static void main(String[] args) {
        System.out.println(generateString(6));
    }
}
