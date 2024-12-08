package com.itheima.service;

import com.itheima.entity.User;
import com.itheima.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    // 获取所有用户
    public List<User> getAllUsers() {
        return userMapper.findAll();
    }

    // 清空并添加数据
    public void resetAndAddUsers() {
        // 清空表数据
        userMapper.clearTable();

        // 要添加的数据
        List<User> users = Arrays.asList(
                new User(null, "Seele", 17),
                new User(null, "Jing Yuan", 60),
                new User(null, "Silver Wolf", 19),
                new User(null, "Luocha", 25),
                new User(null, "Blade", 114),
                new User(null, "Kafka", 45),
                new User(null, "Dan Heng Imbibitor Lunae", 30),
                new User(null, "Fu Xuan", 27)
        );

        // 添加每个用户
        for (User user : users) {
            userMapper.insertUser(user.getName(), user.getAge());
        }
    }
}
