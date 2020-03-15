package com.lsy.service;

import com.lsy.po.User;

/**
 * @author lsy
 * @data 2020/3/12 - 22:25
 */
public interface UserService {

    User checkUser(String username, String password);
}
