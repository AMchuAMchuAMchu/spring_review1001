package com.itcast.dao.impl;

import com.itcast.dao.AnimeDao;
import org.springframework.stereotype.Repository;

@Repository
public class AnimeDaoImpl implements AnimeDao {
    @Override
    public void insertOne() {
        System.out.println("DAO insertOne...");
    }
}
