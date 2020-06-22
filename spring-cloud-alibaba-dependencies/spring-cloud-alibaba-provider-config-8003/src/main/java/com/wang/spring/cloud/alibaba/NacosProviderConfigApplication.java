package com.wang.spring.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderConfigApplication.class,args);
    }
}
