package com.example.springbootthreaddemo.controller;

import com.example.springbootthreaddemo.persistence.User;
import com.example.springbootthreaddemo.service.IUserService;
import com.example.springbootthreaddemo.service.SMSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LB on 2020/6/4
 */
@RestController
public class UserController {
    @Autowired
    IUserService userService;

    @Autowired
    SMSClient smsClient;

    @PostMapping("/user")
    public String addUser(User user){
        long start = System.currentTimeMillis();
        userService.insert(user);
        long end = System.currentTimeMillis();
        return "SUCCESS:"+(end-start);
    }

    @PostMapping("sms/user")
    public String Register(User user){
        long start = System.currentTimeMillis();
        userService.insert(user);
        new Thread(()->{
            try {
                smsClient.sendSMS("17857159201");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        long end = System.currentTimeMillis();
        return "SUCCESS:"+(end-start);
    }
}
