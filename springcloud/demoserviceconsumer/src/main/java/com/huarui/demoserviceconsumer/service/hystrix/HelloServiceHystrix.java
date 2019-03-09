package com.huarui.demoserviceconsumer.service.hystrix;

import com.huarui.demoserviceproviderapi.service.IHelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements IHelloService {
    @Override
    public String getData(String name) {
        return name + "，抱歉服务器挂了";
    }
}
