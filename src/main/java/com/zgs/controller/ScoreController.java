package com.zgs.controller;

import com.zgs.dao.ScoreDao;
import com.zgs.pojo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("score")
public class ScoreController {

    @Autowired
    private ScoreDao scoreDao;

    @PostMapping("insert")
    @ResponseBody
    public void insert(Score score) {
        scoreDao.saveOrUpdate(score);
    }

    @RequestMapping("delete/{id}")
    public ModelAndView delete(@PathVariable String id, ModelAndView modelAndView) {
        scoreDao.deleteById(id);
        List<Score> all = scoreDao.findAll();
        modelAndView.addObject("scores", all);
        modelAndView.setViewName("score/score");
        return modelAndView;
    }

    @GetMapping("findAll")
    public ModelAndView findAll(ModelAndView modelAndView) {
        List<Score> all = scoreDao.findAll();
        modelAndView.addObject("scores", all);
        modelAndView.setViewName("score/score");
        return modelAndView;
    }
}
