package com.tionkior.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName : RedisProperties
 * @Author : TionKior
 * @Date : 2021/6/21 10:06
 * @Version : V1.0
 * @Description :
 */

@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    private String host = "localhost";
    private int port = 6379;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
