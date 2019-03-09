package com.huarui.demoserviceconsumer.service;

import com.huarui.demoserviceconsumer.service.hystrix.HelloServiceHystrix;
import com.huarui.demoserviceproviderapi.service.IHelloService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-hi", fallback = HelloServiceHystrix.class)
public interface HelloService extends IHelloService {

}
