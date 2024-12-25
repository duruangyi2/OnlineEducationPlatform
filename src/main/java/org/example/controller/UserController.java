package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // 获取所有用户列表
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // 获取单个用户详情
    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    // 添加新用户
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // 更新用户信息
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    // 删除用户
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}