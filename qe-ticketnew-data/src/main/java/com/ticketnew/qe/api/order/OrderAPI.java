package com.ticketnew.qe.api.order;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.ticketnew.qe.api.BasicAPI;
import com.ticketnew.qe.api.csb.CsbResponse;
import com.ticketnew.qe.api.csb.HttpRequestUtil;
import org.inferred.freebuilder.FreeBuilder;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/5/2
 */
@FreeBuilder
public interface OrderAPI extends BasicAPI {

    Optional<String> sessionId();

    Optional<String> status();

    Optional<String> tradeId();

    Optional<String> lastTradeId();

    Optional<Integer> pageSize();

    Builder toBuilder();

    enum OrderAPIEnum {
        ORDER_COUNT_BY_STATUS("ORDER_COUNT_BY_STATUS", "ticketnew.app.order.getOrderCountByStatus"),
        ORDER_COUNT("ORDER_COUNT", "ticketnew.app.order.getOrderCount"),
        ORDER_DETAIL("ORDER_DETAIL", "ticketnew.app.order.getOrderDetail"),
        ORDERS("ORDERS", "ticketnew.app.order.getOrders");

        private String orderType;
        private String apiName;

        OrderAPIEnum(String orderType, String apiName) {
            this.orderType = orderType;
            this.apiName = apiName;
        }

        public String getApiName() {
            return this.apiName;
        }

        public String getOrderType() {
            return this.orderType;
        }

    }

    class Builder extends OrderAPI_Builder {

        private Map<String, String> params = new HashMap<>();
        private String api = null;
        private HttpRequestUtil httpRequestUtil = new HttpRequestUtil();

        public CsbResponse getOrderCountByStatus() {
            api = OrderAPIEnum.ORDER_COUNT_BY_STATUS.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse getOrderCount() {
            api = OrderAPIEnum.ORDER_COUNT.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse getOrderDetail() {
            api = OrderAPIEnum.ORDER_DETAIL.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public CsbResponse getOrders() {
            api = OrderAPIEnum.ORDERS.getApiName();
            addParams();
            return httpRequestUtil.doGet(api, params);
        }

        public void addParams() {

            if (sessionId().isPresent()) {
                params.put("sessionId", sessionId().get());
            }

            if (status().isPresent()) {
                params.put("status", status().get());
            }

            if (tradeId().isPresent()) {
                params.put("tradeId", tradeId().get());
            }

            if (lastTradeId().isPresent()) {
                params.put("lastTradeId", lastTradeId().get());
            }

            if (pageSize().isPresent()) {
                params.put("pageSize", String.valueOf(pageSize().get()));
            }

            if (appPlatform().isPresent()) {
                params.put("appPlatform", appPlatform().get());
            }

            if (appChannel().isPresent()) {
                params.put("appChannel", appChannel().get());
            }

            if (appVersion().isPresent()) {
                params.put("appVersion", appVersion().get());
            }

            if (appDevice().isPresent()) {
                params.put("appDevice", appDevice().get());
            }

            if (appEnv().isPresent()) {
                params.put("appEnv", appEnv().get());
            }
        }

    }
}
