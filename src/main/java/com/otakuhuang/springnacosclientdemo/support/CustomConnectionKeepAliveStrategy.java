package com.otakuhuang.springnacosclientdemo.support;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

import java.util.Arrays;

/**
 * @author otaku
 * @version 1.0
 * @date 2022/2/28 0:41
 * @description description
 */
public class CustomConnectionKeepAliveStrategy implements ConnectionKeepAliveStrategy {
    private static final long DEFAULT_SECONDS = 30L;

    @Override
    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return Arrays.asList(httpResponse.getHeaders(HTTP.CONN_KEEP_ALIVE))
                .stream()
                .filter(h -> StringUtils.equalsIgnoreCase(h.getName(), "timeout")
                        && StringUtils.isNumeric(h.getValue()))
                .findFirst()
                .map(h -> NumberUtils.toLong(h.getValue(), DEFAULT_SECONDS))
                .orElse(DEFAULT_SECONDS) * 1000;
    }
}
