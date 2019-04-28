package com.example.springbootaop.aopdemo.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("@annotation(com.example.springbootaop.aopdemo.aspect.MyAnnotation)")
    public void annotationPC() {
    }

//    @Pointcut("execution(* com.example.springbootaop.aopdemo.service.MyServiceInt.method1())")
//    public void executionPC() {
//    }
//
//    @Pointcut("within(com.example.springbootaop.aopdemo.service.MyServiceInt.*)")
//    public void withinPC() {
//    }


    @Before("annotationPC()")
    public void adviceAction(JoinPoint jp) {

        System.out.println("MyAspect advice triggered: " + jp.toString());
    }
}
