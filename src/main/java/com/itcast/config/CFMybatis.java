package com.itcast.config;

import com.itcast.dao.AnimeDao;
import com.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CFMybatis {

    @Bean
    public AnimeDao getSF(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        List<User> users = sqlSessionFactory.openSession().getMapper(AnimeDao.class).selectAll();
//        return sqlSessionFactory;
        AnimeDao mapper = sqlSessionFactory.openSession().getMapper(AnimeDao.class);

        return mapper;
    }



}
