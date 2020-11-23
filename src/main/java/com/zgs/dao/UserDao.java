package com.zgs.dao;

import com.zgs.pojo.User;

import java.util.List;

public interface UserDao {

    void saveOrUpdate(User User);

    User findById(String id);

    User findByUsername(String username);

    List<User> findAll();

    void deleteById(String id);
}
