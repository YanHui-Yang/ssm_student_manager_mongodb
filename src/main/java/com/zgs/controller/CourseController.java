package com.zgs.controller;

import com.zgs.dao.CourseDao;
import com.zgs.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseDao courseDao;

    @PostMapping("insert")
    @ResponseBody
    public void insert(Course course) {
        courseDao.saveOrUpdate(course);
    }

    @RequestMapping("delete/{id}")
    public ModelAndView delete(@PathVariable String id, ModelAndView modelAndView) {
        courseDao.deleteById(id);
        List<Course> all = courseDao.findAll();
        modelAndView.addObject("courses", all);
        modelAndView.setViewName("course/course");
        return modelAndView;
    }

    @GetMapping("findAll")
    public ModelAndView findAll(ModelAndView modelAndView) {
        List<Course> all = courseDao.findAll();
        modelAndView.addObject("courses", all);
        modelAndView.setViewName("course/course");
        return modelAndView;
    }
}
