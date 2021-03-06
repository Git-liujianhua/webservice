package com.raysvalve.service;

import com.raysvalve.entity.User;

import javax.ws.rs.*;
import javax.ws.rs.ext.ParamConverter;
import java.util.List;

//访问当前服务接口对应的路劲
@Path("/userService")
//服务器支持的返回的数据格式的类型
@Produces("*/*")
public interface IUserService {

    //表示处理的请求类型，post对应的是inster新增操作
    @POST
    //访问当前接口对应的方法访问的路径【/userService/user】
    @Path("/user")
    //服务器支持的请求的格式类型
    @Consumes({"application/xml","application/json"})
    public void saveUser(User user);

    //表示处理的请求类型，put对应的是update修改操作
    @PUT
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void updateUser(User user);

    //表示处理的请求类型，get对应的是查询修改操作
    @GET
    @Path("/user")
    @Produces({"application/xml","application/json"})
    public List<User> findAllUsers();

    @GET
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    @Produces({"application/xml","application/json"})
    public User finUserById(@PathParam("id")Integer id);

    //表示处理的请求类型，delete对应的是删除操作
    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    public void deleteUser(@PathParam("id")Integer id);
}
