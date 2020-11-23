package com.zgs.controller;

import com.zgs.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("page")
public class PageController {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private CourseDao courseDao;
    @Autowired
    private ScoreDao scoreDao;
    @Autowired
    private TeacherDao teacherDao;

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("head")
    public String head() {
        return "head";
    }

    @GetMapping("left")
    public String left() {
        return "left";
    }

    @GetMapping("admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("content")
    public String content() {
        return "content";
    }

    @GetMapping("course")
    public String course() {
        return "course";
    }

    @RequestMapping("addStudent")
    public String addStudent() {
        return "student/add";
    }

    @RequestMapping("editStudent/{id}")
    public String editStudent(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("student", studentDao.findById(id));
        return "student/edit";
    }

    @RequestMapping("addUser")
    public String addUser() {
        return "user/add";
    }

    @RequestMapping("editUser/{id}")
    public String editUser(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("user", userDao.findById(id));
        return "user/edit";
    }

    @RequestMapping("addCourse")
    public String addCourse() {
        return "course/add";
    }

    @RequestMapping("editCourse/{id}")
    public String editCourse(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("course", courseDao.findById(id));
        return "course/edit";
    }

    @RequestMapping("addScore")
    public String addScore() {
        return "score/add";
    }

    @RequestMapping("editScore/{id}")
    public String editScore(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("score", scoreDao.findById(id));
        return "score/edit";
    }

    @RequestMapping("addTeacher")
    public String addTeacher() {
        return "teacher/add";
    }

    @RequestMapping("editTeacher/{id}")
    public String editTeacher(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("teacher", teacherDao.findById(id));
        return "teacher/edit";
    }
}
