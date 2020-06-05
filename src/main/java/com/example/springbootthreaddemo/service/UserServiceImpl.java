package com.example.springbootthreaddemo.service;

import com.example.springbootthreaddemo.persistence.User;
import com.example.springbootthreaddemo.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LB on 2020/6/4
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    UserMapper userMapper;
    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
