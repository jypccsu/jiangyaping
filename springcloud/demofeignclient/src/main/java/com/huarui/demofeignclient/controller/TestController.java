package com.huarui.demofeignclient.controller;

import com.huarui.demofeignclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/m1")
    public String m1(String name){
        return helloService.getData(name);
    }
}
