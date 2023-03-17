package com.itcast;

import com.itcast.config.CFSpring;
import com.itcast.service.AnimeService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnime1001 {

    @Test
    public void testDAOService(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CFSpring.class);

        AnimeService bean = ac.getBean(AnimeService.class);

        bean.insertAnime();

    }

}
