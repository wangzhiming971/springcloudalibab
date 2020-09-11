package com.wang.spring.cloud.alibaba.fallback;

import com.wang.spring.cloud.alibaba.service.EchoService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author zkr.wangzm
 */
@Component
public class NacosFallback implements FallbackFactory<EchoService> {
    @Override
    public EchoService create(Throwable throwable) {
        return new EchoService() {
            @Override
            public String echo(String message) {
                return "网络出现故障，清查看!";
            }
        };
    }
}
