package com.ticketnew.qe.api.csb;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/27
 */
public enum EnvironmentEnum {

    PROD("prod"),
    TEST("test"),
    DEV("dev"),
    ;

    private String env;

    EnvironmentEnum(String env) {
        this.env = env;
    }

    public String getEnv() {
        return this.env;
    }
}
