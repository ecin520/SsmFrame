package com.ecin520.ssm.dao;

import com.ecin520.ssm.entity.User;

import java.util.List;


public interface UserDao {
    List<User> getAllUsers();
    boolean insertUser(String password);
}
