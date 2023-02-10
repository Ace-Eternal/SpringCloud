package com.example.controller;

import com.example.pojo.Borrow;
import com.example.pojo.UserBorrowDetail;
import com.example.service.BorrowService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class BorrowController {
    @Resource
    BorrowService service;

    @RequestMapping("/borrow/{uid}")
    UserBorrowDetail findUserBorrows(@PathVariable("uid") int uid){
        return service.getUserBorrowDetailByUid(uid);
    }
}
