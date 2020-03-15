package com.lsy.dao;

import com.lsy.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lsy
 * @data 2020/3/12 - 22:27
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username,String password);
}
