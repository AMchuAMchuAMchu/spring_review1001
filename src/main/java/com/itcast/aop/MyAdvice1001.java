package com.itcast.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class MyAdvice1001 {

    @Pointcut("execution(void com.itcast.service.AnimeService.selectAll())")
    public void pt(){}

    @Before("pt()")
    public void addTime(){
        System.out.println(LocalDateTime.now());
    }

}
