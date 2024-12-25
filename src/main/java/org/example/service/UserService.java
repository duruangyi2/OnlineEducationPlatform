package org.example.service;

import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    // 查询用户
    public User getUserById(int id) {
        return userMapper.selectUserById(id);
    }

    // 查询所有用户
    public List<User> getAllUsers() {
        return userMapper.selectAllUsers();
    }

    // 插入用户
    public User createUser(User user) {
        userMapper.insertUser(user);
        return user;  // 返回插入后的用户（通常会返回插入的对象）
    }

    // 更新用户信息
    public User updateUser(int id, User user) {
        user.setId(id);  // 确保传入的用户对象使用正确的ID
        userMapper.updateUser(user);
        return user;  // 返回更新后的用户
    }

    // 删除用户
    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }
}

