package com.zgs.controller;

import com.zgs.dao.StudentDao;
import com.zgs.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @PostMapping("insert")
    @ResponseBody
    public void insert(Student student) {
        studentDao.saveOrUpdate(student);
    }

    @RequestMapping("delete/{id}")
    public ModelAndView delete(@PathVariable String id, ModelAndView modelAndView) {
        studentDao.deleteById(id);
        List<Student> all = studentDao.findAll();
        modelAndView.addObject("students", all);
        modelAndView.setViewName("student/student");
        return modelAndView;
    }

    @GetMapping("findAll")
    public ModelAndView findAll(ModelAndView modelAndView) {
        List<Student> all = studentDao.findAll();
        modelAndView.addObject("students", all);
        modelAndView.setViewName("student/student");
        return modelAndView;
    }
}
