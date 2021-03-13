package com.raysvalve;

import com.raysvalve.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

public class Client {


    @Test
    public void testSave(){
        User user = new User();
        user.setId(121);
        user.setUsername("bai");
        user.setCity("henan");
        WebClient.create("http://localhost:13598/ws/userService/userService/user")
                 .type(MediaType.APPLICATION_XML)//指定请求的数据格式为json
                 .post(user);
    }
    @Test
    public void testType(){
        User user =
        WebClient.create("http://localhost:13598/ws/userService/userService/user/1")
                .accept(MediaType.APPLICATION_JSON)
                .get(User.class);
        System.out.println(user);
    }
}
