package com.raysvalve.service.Impl;

import com.raysvalve.entity.Car;
import com.raysvalve.entity.User;
import com.raysvalve.service.IUserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService {

    public void saveUser(User user){
        System.out.println("save user:" + user);
    }
    public void updateUser(User user){
        System.out.println("save user:" + user);
    }

    public List<User> findAllUsers(){
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("小妹");
        user1.setCity("温州");
        users.add(user1);

        List<Car> carList1 = new ArrayList<Car>();

        Car car1 = new Car();
        car1.setId(101);
        car1.setCarName("劳斯莱斯");
        car1.setPrice(10000000d);
        carList1.add(car1);

        Car car2 = new Car();
        car2.setId(102);
        car2.setCarName("保时捷");
        car2.setPrice(1000000d);
        carList1.add(car2);
        user1.setCars(carList1);


        User user2 = new User();
        user2.setId(2);
        user2.setUsername("小米");
        user2.setCity("上海");
        users.add(user2);

        return users;

    }
    public User finUserById(Integer id){
        if (id==1){
            User user1 = new User();
            user1.setId(1);
            user1.setUsername("小丽");
            user1.setCity("山西");
            return user1;
        }
        return null;
    }
    public void deleteUser(Integer id){
        System.out.println("delete user id:" + id);
    }
}
