package com.itcast.service.impl;

import com.itcast.config.CFMybatis;
import com.itcast.config.CFSpring;
import com.itcast.dao.AnimeDao;
import com.itcast.pojo.User;
import com.itcast.service.AnimeService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class AnimeServiceImpl implements AnimeService {

    @Autowired
    private AnimeDao animeDao;

//  查询所有
    @Override
    public void selectAll() {
        List<User> users = animeDao.selectAll();
        System.out.println("selectAll获取的数据如下:");
        users.forEach(System.out::println);
        System.out.println("service insertOne...");
    }

    @Override
    public void selectByName(String name) {
        System.out.println("根据Name查出如下::");
        System.out.println(animeDao.selectByName(name));
    }
}
