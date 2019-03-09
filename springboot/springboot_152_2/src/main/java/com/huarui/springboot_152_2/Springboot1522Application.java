package com.huarui.springboot_152_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 14:27 2019/3/8
 * @ Description  : 入口类
 */
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
public class Springboot1522Application {
    public static void main(String[] args){
        SpringApplication.run(Springboot1522Application.class,args);
    }
}
