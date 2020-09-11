package com.wang.spring.cloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zkr.wangzm
 */
@RestController
public class NacosProviderConfigController {


    @GetMapping(value = "/echo/config")
    public String echo(){
        return "Nacos Provider Config";
    }
}
