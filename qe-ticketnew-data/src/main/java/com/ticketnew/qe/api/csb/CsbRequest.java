package com.ticketnew.qe.api.csb;

import java.util.Map;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/4/19
 */
public class CsbRequest {

    private Map<String,String> request;
    private String _api_name;
    private String _api_version;
    private long _api_timestamp;
    private String _api_access_key;

    public Map getRequest() {
        return request;
    }

    public void setRequest(Map request) {
        this.request = request;
    }

    public String get_api_name() {
        return _api_name;
    }

    public void set_api_name(String _api_name) {
        this._api_name = _api_name;
    }

    public String get_api_version() {
        return _api_version;
    }

    public void set_api_version(String _api_version) {
        this._api_version = _api_version;
    }

    public long get_api_timestamp() {
        return _api_timestamp;
    }

    public void set_api_timestamp(long _api_timestamp) {
        this._api_timestamp = _api_timestamp;
    }

    public String get_api_access_key() {
        return _api_access_key;
    }

    public void set_api_access_key(String _api_access_key) {
        this._api_access_key = _api_access_key;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
