package com.swp.service;

import com.swp.entity.User;

/**
 * @author: Way
 * description
 * date 2024/6/29 21:27
 */
public interface UserService {
    User findByUsername(String username);

    boolean checkPassword(User foundUser, String password);
}
