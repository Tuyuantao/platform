package com.ticketnew.qe.api.entity;

import java.util.List;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/13
 */
public class Movie {

    private Integer id;
    private Long releaseDate;
    private String poster;
    private String displayName;

    //old version field
    private String version;
    private String certificate;
    private String language;

    //new version field
    private List<MergeField> mergeFields;
    private List<String> languages;
    private List<String> versions;
    private List<String> certificates;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Long releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<MergeField> getMergeFields() {
        return mergeFields;
    }

    public void setMergeFields(List<MergeField> mergeFields) {
        this.mergeFields = mergeFields;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

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

    //public String getLanguagesString() {
    //    return convertListToString(languages);
    //}

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    //public String getVersionsString() {
    //    return convertListToString(versions);
    //}

    public void setVersions(List<String> versions) {
        this.versions = versions;
    }

    //public String getCertificatesString() {
    //    return convertListToString(certificates);
    //}

    public List<String> getLanguages() {
        return languages;
    }

    public List<String> getVersions() {
        return versions;
    }

    public List<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }

}
