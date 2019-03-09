package com.huarui.demoserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoserviceproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoserviceproviderApplication.class, args);
    }

}
