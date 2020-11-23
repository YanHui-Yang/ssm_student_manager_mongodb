package com.zgs.dao.impl;

import com.zgs.dao.StudentDao;
import com.zgs.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Student> findAll() {
        return mongoTemplate.findAll(Student.class);
    }

    @Override
    public void saveOrUpdate(Student student) {
        mongoTemplate.save(student);
    }

    @Override
    public Student findById(String id) {
        return mongoTemplate.findById(id, Student.class);
    }

    @Override
    public void deleteById(String id) {
        Student student = findById(id);
        mongoTemplate.remove(student);
    }
}
