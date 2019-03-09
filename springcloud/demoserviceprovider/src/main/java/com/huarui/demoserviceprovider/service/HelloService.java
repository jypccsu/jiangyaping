package com.huarui.demoserviceprovider.service;

import com.huarui.demoserviceproviderapi.service.IHelloService;
import org.springframework.stereotype.Service;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 18:03 2019/3/8
 * @ Description  :
 */
@Service
public class HelloService implements IHelloService {
    @Override
    public String getData(String name) {
        return "您好,"+name;
    }
}
