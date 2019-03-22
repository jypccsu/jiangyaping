package com.huarui.springboot_152_5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;

@SpringBootApplication
@MapperScan("com.huarui.springboot_152_5.mapper")
public class Springboot1525Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1525Application.class, args);
    }

}
