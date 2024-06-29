package com.swp.service.impl;

import com.swp.entity.User;
import com.swp.mapper.UserMapper;
import com.swp.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Way
 * description
 * date 2024/6/29 21:27
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findByUsername(String username) {
       User user= userMapper.findByUsername(username);
       return user;
    }

    @Override
    public boolean checkPassword(User foundUser, String password) {
        if (foundUser.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
