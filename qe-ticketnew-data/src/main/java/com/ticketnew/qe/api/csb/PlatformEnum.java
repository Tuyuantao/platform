package com.ticketnew.qe.api.csb;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/27
 */
public enum PlatformEnum {

    ANDROID("ANDROID"),
    IOS("IOS"),
    H5("H5"),
    ;

    private String platform;

    PlatformEnum(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return this.platform;
    }
}
