package com.wang.spring.cloud.alibaba.controller;

import com.wang.spring.cloud.alibaba.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zkr.wangzm
 */
@RestController
public class NacosConsumerFeignController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo/hi")
    public String echo(){
        return echoService.echo("Hi Fegin");
    }
}
