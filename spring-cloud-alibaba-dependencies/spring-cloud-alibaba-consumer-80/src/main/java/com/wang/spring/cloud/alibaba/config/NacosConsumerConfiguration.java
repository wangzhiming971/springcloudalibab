package com.wang.spring.cloud.alibaba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zkr.wangzm
 */
@Configuration
public class NacosConsumerConfiguration {


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
