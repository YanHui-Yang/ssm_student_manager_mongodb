package com.zgs.dao.impl;

import com.zgs.dao.TeacherDao;
import com.zgs.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDaoImpl implements TeacherDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveOrUpdate(Teacher teacher) {
        mongoTemplate.save(teacher);
    }

    @Override
    public Teacher findById(String id) {
        return mongoTemplate.findById(id, Teacher.class);
    }

    @Override
    public List<Teacher> findAll() {
        return mongoTemplate.findAll(Teacher.class);
    }

    @Override
    public void deleteById(String id) {
        Teacher teacher = findById(id);
        mongoTemplate.remove(teacher);
    }
}
