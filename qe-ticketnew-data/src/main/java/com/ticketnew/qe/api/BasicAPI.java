package com.ticketnew.qe.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.inferred.freebuilder.FreeBuilder;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/13
 */
@FreeBuilder
public interface BasicAPI {

    Optional<String> appPlatform();

    Optional<String> appChannel();

    Optional<String> appVersion();

    Optional<String> appDevice();

    Optional<String> appEnv();


    class Builder extends BasicAPI_Builder {
        private Map<String, String> params = new HashMap<>();

        public void addParams() {
            if(appPlatform().isPresent()) {
                params.put("appPlatform", appPlatform().get());
            }

            if(appChannel().isPresent()) {
                params.put("appChannel", appChannel().get());
            }

            if(appVersion().isPresent()) {
                params.put("appVersion", appVersion().get());
            }

            if(appDevice().isPresent()) {
                params.put("appDevice", appDevice().get());
            }

            if(appEnv().isPresent()) {
                params.put("appEnv", appEnv().get());
            }
        }
    }
}
