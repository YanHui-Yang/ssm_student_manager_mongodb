package com.zgs.controller;

import com.zgs.dao.TeacherDao;
import com.zgs.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherDao teacherDao;

    @PostMapping("insert")
    @ResponseBody
    public void insert(Teacher teacher) {
        teacherDao.saveOrUpdate(teacher);
    }

    @RequestMapping("delete/{id}")
    public ModelAndView delete(@PathVariable String id, ModelAndView modelAndView) {
        teacherDao.deleteById(id);
        List<Teacher> all = teacherDao.findAll();
        modelAndView.addObject("teachers", all);
        modelAndView.setViewName("teacher/teacher");
        return modelAndView;
    }

    @GetMapping("findAll")
    public ModelAndView findAll(ModelAndView modelAndView) {
        List<Teacher> all = teacherDao.findAll();
        modelAndView.addObject("teachers", all);
        modelAndView.setViewName("teacher/teacher");
        return modelAndView;
    }
}
