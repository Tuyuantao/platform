package com.ticketnew.qe.api.csb;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/27
 */
public enum VersionEnum {

    VERSION_4_1("4.1.0"),
    VERSION_4_2("4.2.0"),
    ;

    private String version;

    VersionEnum(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }

    public static VersionEnum transferToEnum(String version) {
        for(VersionEnum versionEnum: VersionEnum.values()) {
            if(versionEnum.getVersion().equalsIgnoreCase(version)) {
                return versionEnum;
            }
        }
        return null;
    }
}

