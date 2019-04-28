package com.example.springbootaop.aopdemo.service;

import com.example.springbootaop.aopdemo.aspect.MyAnnotation;
import org.springframework.stereotype.Service;

@Service
public class MyService implements MyServiceInt {

    @Override
    @MyAnnotation
    public void method1() {
        System.out.println("method1");
        method2();
    }

    @Override
    @MyAnnotation
    public void method2() {
        System.out.println("method2");
    }
}
