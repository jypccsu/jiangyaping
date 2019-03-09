package com.huarui.demoserviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//SpringCLoud中的“Discovery Service”有多种实现，比如：eureka, consul, zookeeper。
//@EnableDiscoveryClient可以指定任意实现，@EnableEurekaClient只能用于eureka
//@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@SpringBootApplication
public class DemoserviceconsumerApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoserviceconsumerApplication.class, args);
    }

}
