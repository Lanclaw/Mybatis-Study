package com.lanclaw.dao;

import com.lanclaw.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    List<User> getUserLike(String name);

    List<User> getUserByLimit(Map<String, Integer> map);

    List<User> getUserByRowBounds();
}
