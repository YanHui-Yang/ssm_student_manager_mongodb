package com.zgs.dao;

import com.zgs.pojo.Teacher;

import java.util.List;

public interface TeacherDao {

    void saveOrUpdate(Teacher teacher);

    Teacher findById(String id);

    List<Teacher> findAll();

    void deleteById(String id);
}
