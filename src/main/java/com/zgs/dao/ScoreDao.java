package com.zgs.dao;

import com.zgs.pojo.Score;

import java.util.List;

public interface ScoreDao {

    List<Score> findAll();

    void saveOrUpdate(Score score);

    Score findById(String id);

    void deleteById(String id);
}
