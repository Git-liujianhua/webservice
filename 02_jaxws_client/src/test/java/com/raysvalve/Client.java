package com.raysvalve;

import com.raysvalve.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;


public class Client {
    public static void main(String[] args) {
        
        //创建cxf代理工厂
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        //设置远程访问服务气端地址
        factory.setAddress("http://localhost:13598/ws/hello");
        //设置接口类型
        factory.setServiceClass(HelloService.class);
        //对接口生成代理对象
        HelloService helloService = factory.create(HelloService.class);
        //代理对象 class com.sun.proxy.$Proxy35【java代理：静态代理；动态代理（jdk代理、cglib代理）】$CGLIB
        System.out.println(helloService.getClass());
        //远程访问服务端方法
        String content = helloService.sayHello("Jet：");

        System.out.println(content);

    }
}
