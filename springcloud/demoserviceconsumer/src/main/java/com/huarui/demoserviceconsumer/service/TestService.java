package com.huarui.demoserviceconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.print.DocFlavor;

@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String getData(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hello?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "您好," + name + "，服务器出现故障！";
    }
}
