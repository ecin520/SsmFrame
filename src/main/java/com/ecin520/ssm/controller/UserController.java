package com.ecin520.ssm.controller;

import com.ecin520.ssm.entity.User;
import com.ecin520.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUsers")
    @ResponseBody
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping("/insertUser")
    @ResponseBody
    public boolean insertUser(@RequestParam("password") String password){
        System.out.println(password);
        return userService.insertUser(password);
    }
}
