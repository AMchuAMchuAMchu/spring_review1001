package com.itcast;

import com.alibaba.druid.pool.DruidDataSource;
import com.itcast.config.CFSpring;
import com.itcast.pojo.Anime1001;
import com.itcast.service.AnimeService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class TestAnime1001 {

    @Test
    public void testDAOService(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CFSpring.class);

//        AnimeService bean = ac.getBean(AnimeService.class);
//
//        bean.insertAnime();

//        Anime1001 bean = ac.getBean(Anime1001.class);
//        System.out.println(bean);


//        DataSource bean = ac.getBean(DataSource.class);
//
//        System.out.println(bean);


        AnimeService bean = ac.getBean(AnimeService.class);

//        bean.selectAll();
        bean.selectByName("刀剑神域");

    }

}
