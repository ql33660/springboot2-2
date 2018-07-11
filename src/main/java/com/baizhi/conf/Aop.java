package com.baizhi.conf;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * Created by qiao on 2018/7/3.
 */
@Configuration
@Aspect
public class Aop {
//    @Before("execution(* com.baizhi.service.*.*(..))")
//    public void before(JoinPoint joinPoint){
//        System.out.println("aaaaaaaaaaaaaa");
//    }

    @Around("execution(* com.baizhi.service.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aaaaaa");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("bbbbbb");
        return obj;
    }
}
