package com.example.springbootthreaddemo.persistence;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by LB on 2020/6/4
 */
@Mapper
public interface UserMapper {
    int insert(User user);
}
