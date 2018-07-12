package com.ticketnew.qe.api.entity;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/13
 */
public class MergeField {
    private String certificate;
    private String language;
    private String version;

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
