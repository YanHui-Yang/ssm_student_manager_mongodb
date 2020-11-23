package com.zgs.dao.impl;

import com.zgs.dao.ScoreDao;
import com.zgs.pojo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScoreDaoImpl implements ScoreDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Score> findAll() {
        return mongoTemplate.findAll(Score.class);
    }

    @Override
    public void saveOrUpdate(Score score) {
        mongoTemplate.save(score);
    }

    @Override
    public Score findById(String id) {
        return mongoTemplate.findById(id, Score.class);
    }

    @Override
    public void deleteById(String id) {
        Score score = findById(id);
        mongoTemplate.remove(score);
    }
}
