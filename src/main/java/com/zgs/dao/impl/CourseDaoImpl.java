package com.zgs.dao.impl;

import com.zgs.dao.CourseDao;
import com.zgs.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDaoImpl implements CourseDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Course> findAll() {
        return mongoTemplate.findAll(Course.class);
    }

    @Override
    public void saveOrUpdate(Course course) {
        mongoTemplate.save(course);
    }

    @Override
    public Course findById(String id) {
        return mongoTemplate.findById(id, Course.class);
    }

    @Override
    public void deleteById(String id) {
        Course course = findById(id);
        mongoTemplate.remove(course);
    }
}
