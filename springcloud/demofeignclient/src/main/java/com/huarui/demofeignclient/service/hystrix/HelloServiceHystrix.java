package com.huarui.demofeignclient.service.hystrix;

import com.huarui.demofeignclient.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String getData(String name) {
        return name +"，抱歉服务器挂了";
    }
}
