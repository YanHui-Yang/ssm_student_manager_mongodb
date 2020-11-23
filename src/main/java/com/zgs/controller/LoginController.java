package com.zgs.controller;

import com.zgs.dao.UserDao;
import com.zgs.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class LoginController {

    @Autowired
    private UserDao userDao;

    /**
     * 进入首页
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {

        return "index";   //默认是转发，不会显示转发路径
    }

    /**
     * 进入登录界面
     *
     * @return
     */
    @GetMapping("/login")
    public String login() {

        return "login";   //默认是转发，不会显示转发路径
    }


    /**
     * 点击登录
     *
     * @return String
     */
    @PostMapping("login")
    public String login(HttpServletRequest request) {
        //获取用户和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //根据邮箱或昵称查询，用户是否存在
        User user = userDao.findByUsername(username);

        //如果存在
        if (user != null) {

            if (password.equals(user.getPassword())) {
                //如果密码正确
                //将用户信息放入到会话中...
                request.getSession().setAttribute("user", user);

                //这里使用重定向 ,重定向到当前命名空间下@RequestMapping是index的方法
                return "redirect:index";
            } else {
                //如果密码错误
                System.out.println("密码错误");
                return "index/error";
            }
        } else {
            //如果不存在，代码邮箱和密码输入有误
            System.out.println("用户不存在");
            return "index/error";
        }
    }

    /**
     * 退出登录控制层
     *
     * @return String
     */
    @RequestMapping(method = RequestMethod.GET, value = "/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate(); //清空session值
        return "login";
    }
}
