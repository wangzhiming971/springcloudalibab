package com.wang.spring.cloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NacosConsumerController {
    private final String serviceId="nacos-provider";
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient LoadBalancerClient;

    @Value(value ="${spring.application.name}")
    private String appName;

    @GetMapping("/echo/app/name")
    public String echo(){
        //使用 LoadBalanceClient 和 RestTemplate 结合的方式来访问
        ServiceInstance serviceInstance = LoadBalancerClient.choose(serviceId);
        String url = String.format("http://%s:%s/echo/%s", serviceInstance.getHost(), serviceInstance.getPort(), appName);
        return restTemplate.getForObject(url, String.class);
    }
}
