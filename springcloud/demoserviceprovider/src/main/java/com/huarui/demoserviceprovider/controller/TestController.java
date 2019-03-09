package com.huarui.demoserviceprovider.controller;

import com.huarui.demoserviceprovider.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    HelloService helloService;

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String m1(String name){
        return "微服务provider的端口号:"+port+"\t"+helloService.getData(name);
    }

    @GetMapping("abc")
    public String abc(){
        System.out.println("abc...");
        return "abc";
    }
}
