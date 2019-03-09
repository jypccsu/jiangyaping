package com.huarui.demoservicezuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 11:40 2019/4/18
 * @ Description  : 控制器
 */
@RestController
public class TestController {
    @RequestMapping("/method1")
    public String method1(){
        System.out.println("method1()方法...");
        return "method1()方法";
    }
}
