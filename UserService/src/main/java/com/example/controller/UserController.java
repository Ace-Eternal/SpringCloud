package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserService service;

    @RequestMapping("/user/{uid}")
    public User getUser(@PathVariable(value = "uid") int uid){
        return service.queryUser(uid);
    }
}
