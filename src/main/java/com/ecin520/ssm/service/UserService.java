package com.ecin520.ssm.service;

import com.ecin520.ssm.dao.UserDao;
import com.ecin520.ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService implements UserDao{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    @Override
    public boolean insertUser(String password) {
        try{
            userDao.insertUser(password);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
}
