package com.huarui.demofeignclient.service;

import com.huarui.demofeignclient.service.hystrix.HelloServiceHystrix;
import com.huarui.demoserviceproviderapi.service.IHelloService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = HelloServiceHystrix.class)
public interface HelloService extends IHelloService {

}
