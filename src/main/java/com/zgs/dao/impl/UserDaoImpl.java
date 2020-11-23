package com.zgs.dao.impl;

import com.zgs.dao.UserDao;
import com.zgs.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveOrUpdate(User User) {

        mongoTemplate.save(User);
    }

    public User findById(String id) {

        return mongoTemplate.findById(id, User.class);
    }

    public List<User> findAll() {

        return mongoTemplate.findAll(User.class);
    }

    @Override
    public void deleteById(String id) {
        User user = findById(id);
        mongoTemplate.remove(user);
    }

    public User findByUsername(String username) {

        Query sql = new Query(Criteria.where("username").is(username));
        return mongoTemplate.findOne(sql, User.class);
    }
}
