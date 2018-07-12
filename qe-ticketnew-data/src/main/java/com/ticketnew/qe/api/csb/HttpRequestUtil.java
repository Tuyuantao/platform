package com.ticketnew.qe.api.csb;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.alibaba.aosp.security.sdk.SignUtil;
import com.alibaba.csb.sdk.HttpCaller;
import com.alibaba.csb.sdk.HttpCallerException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/3/23
 */
public class HttpRequestUtil {

    private static final Logger logger = LoggerFactory.getLogger(HttpRequestUtil.class);
    private static Gson gson = new GsonBuilder().create();
    public String requestUrl = null;
    public String ak = null;
    public String sk = null;
    public String defaultVersion = null;
    public String environment = null;

    public HttpRequestUtil() {
        requestUrl = "http://test-api.ticketnew.com/api";
        ak = "4a87d9576ba24f119aaf746bcc66b27d";
        sk = "rtuaexpUALoE3FPEGGzvhpLVxU8=";
        defaultVersion = "1.0.0";
        environment = "test";
    }

    public CsbResponse doGet(String api, Map<String, String> request) {
        Map<String, String> params = getParams(request);
        String response = null;
        try {
            response = HttpCaller.doGet(requestUrl, api, defaultVersion, params, ak, sk);
        } catch (HttpCallerException e) {
            e.printStackTrace();
        }
        return new CsbResponse(response);
    }

    public CsbResponse doPost(String api, Map<String, String> request) {
        Map<String, String> params = getParams(request);
        String response = null;
        try {
            response = HttpCaller.doPost(requestUrl, api, defaultVersion, params, ak, sk);
        } catch (HttpCallerException e) {
            e.printStackTrace();
        }
        return new CsbResponse(response);
    }

    public Map<String, String> getParams(Map<String, String> request) {
        request = getRequest(request);
        Map<String, String> params = new HashMap<String, String>();
        params.put("request", gson.toJson(request));
        return params;
    }

    private Map<String, String> getRequest(Map<String, String> request) {
        if (Objects.isNull(request)) {
            request = new HashMap<>();
        }
        if (!request.containsKey("appPlatform")) {
            request.put("appPlatform", "H5");
        }

        if (!request.containsKey("appChannel")) {
            request.put("appChannel", "TICKETNEW");
        }

        if (!request.containsKey("appVersion")) {
            request.put("appVersion", "4.2.0");
        }

        if (!request.containsKey("appDevice")) {
            request.put("appDevice", "testDevice");
        }

        if (!request.containsKey("appEnv")) {
            request.put("appEnv", environment);
        }

        return request;
    }

    private Map<String, String> prepareParams(String apiName, Map<String, String> request) {
        Map<String, String> params = getParams(request);
        params.put("_api_name", apiName);
        params.put("_api_version", defaultVersion);
        params.put("_api_timestamp", String.valueOf(System.currentTimeMillis()));
        params.put("_api_access_key", ak);
        params.put("_api_signature", SignUtil.sign(params, sk));
        return params;
    }
}
