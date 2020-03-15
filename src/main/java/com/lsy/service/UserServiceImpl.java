package com.lsy.service;

import com.lsy.dao.UserRepository;
import com.lsy.po.User;
import com.lsy.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lsy
 * @data 2020/3/12 - 22:26
 */
@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {
        User user  = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
