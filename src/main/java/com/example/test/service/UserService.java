package com.example.test.service;

import com.example.test.entity.User;
import com.example.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author kzhao
 * @Date 10/21/2019 3:08 PM
 **/
@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }

}
