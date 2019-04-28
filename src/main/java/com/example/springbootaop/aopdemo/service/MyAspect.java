package com.example.springbootaop.aopdemo.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("@annotation(com.example.springbootaop.aopdemo.aspect.MyAnnotation)")
    public void annotated() {
    }

    @Before("annotated()")
    public void adviceAction() {
        System.out.println("MyAspect advice triggered");
    }
}
