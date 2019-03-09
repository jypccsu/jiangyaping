package com.huarui.springboot_152_1.controller;

import com.huarui.springboot_152_1.po.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${cupSize}")
    private String cupSize;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping("/hello")
    public String hello(String name){
        return "姓名:"+name+",罩杯："+cupSize;
    }

    @RequestMapping("/hi")
    public String hi(){
        return girlProperties.getContent();
    }
}
