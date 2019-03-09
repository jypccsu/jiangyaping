package com.huarui.demoserviceconsumer.controller;

import com.huarui.demoserviceconsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/m1")
    public String m1(String name) {
        return testService.getData(name);
    }

    @GetMapping("/m2")
    public String m2(){
        System.out.println("m2()...");
        return "m2()";
    }
}
