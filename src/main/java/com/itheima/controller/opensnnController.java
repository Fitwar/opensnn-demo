package com.itheima.controller;

import com.itheima.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class opensnnController {

    private final UserService userService;

    public opensnnController(UserService userService) {
        this.userService = userService;
    }

    // 获取所有用户
    @GetMapping("/users")
    public Object getUsers() {
        return userService.getAllUsers();
    }

    // 清空表数据并添加新数据
    @GetMapping("/resetAndAddUsers")
    public String resetAndAddUsers() {
        userService.resetAndAddUsers();
        return "Table reset and new users added successfully.";
    }
}
