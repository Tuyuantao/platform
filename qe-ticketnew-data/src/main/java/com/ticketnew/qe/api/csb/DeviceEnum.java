package com.ticketnew.qe.api.csb;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/27
 */
public enum DeviceEnum {

    PC("PC"),
    WEB("WEB"),
    ANDROID("ANDROID"),
    IOS("IOS"),
    ;

    private String device;

    DeviceEnum(String device) {
        this.device = device;
    }

    public String getDevice() {
        return this.device;
    }
}
