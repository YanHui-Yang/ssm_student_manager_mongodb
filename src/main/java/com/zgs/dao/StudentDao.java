package com.zgs.dao;

import com.zgs.pojo.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAll();

    void saveOrUpdate(Student student);

    Student findById(String id);

    void deleteById(String id);
}
