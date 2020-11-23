package com.zgs.controller;

import com.zgs.dao.UserDao;
import com.zgs.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("insert")
    @ResponseBody
    public void insert(User user) {
        userDao.saveOrUpdate(user);
    }

    @RequestMapping("delete/{id}")
    public ModelAndView delete(@PathVariable String id, ModelAndView modelAndView) {
        userDao.deleteById(id);
        List<User> all = userDao.findAll();
        modelAndView.addObject("users", all);
        modelAndView.setViewName("user/user");
        return modelAndView;
    }

    @GetMapping("findAll")
    public ModelAndView findAll(HttpServletRequest request, ModelAndView modelAndView) {
        List<User> all = userDao.findAll();
        modelAndView.addObject("users", all);
        modelAndView.setViewName("user/user");
        return modelAndView;
    }
}
