package com.huarui.demoserviceproviderapi.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface IHelloService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String getData(@RequestParam("name") String name);
}