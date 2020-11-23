package com.zgs.dao;

import com.zgs.pojo.Course;

import java.util.List;

public interface CourseDao {

    List<Course> findAll();

    void saveOrUpdate(Course course);

    Course findById(String id);

    void deleteById(String id);
}
