package org.example.mapper;
import org.example.entity.User;

import java.util.List;

public interface UserMapper {
    User selectUserById(int id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    List<User> selectAllUsers();
}
