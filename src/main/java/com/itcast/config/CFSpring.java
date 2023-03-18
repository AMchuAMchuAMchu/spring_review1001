package com.itcast.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.itcast.pojo.Anime1001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.itcast")
@PropertySource("classpath:jdbc.properties")
@Import({CFMybatis.class})
@EnableAspectJAutoProxy
public class CFSpring {

    @Autowired
    private Anime1001 anime1001;

    @Bean
    public DataSource getDatasource(){
        DruidDataSource source = new DruidDataSource();

        source.setUsername(anime1001.getUsername());

        source.setPassword(anime1001.getPassword());

        source.setUrl(anime1001.getUrl());

        source.setDriverClassName(anime1001.getDriver());

        return source;

    }

}
