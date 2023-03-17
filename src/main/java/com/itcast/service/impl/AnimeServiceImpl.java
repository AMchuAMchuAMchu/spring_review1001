package com.itcast.service.impl;

import com.itcast.dao.AnimeDao;
import com.itcast.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimeServiceImpl implements AnimeService {

    @Autowired
    private AnimeDao animeDao;

    @Override
    public void insertAnime() {
        animeDao.insertOne();
        System.out.println("service insertOne...");
    }
}
