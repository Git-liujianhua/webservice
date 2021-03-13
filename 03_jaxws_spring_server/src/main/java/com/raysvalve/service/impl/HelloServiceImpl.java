package com.raysvalve.service.impl;

import com.raysvalve.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return name + "欧菲石油设备有限公司";
    }
}
