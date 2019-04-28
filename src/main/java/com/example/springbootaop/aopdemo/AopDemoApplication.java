package com.example.springbootaop.aopdemo;

import com.example.springbootaop.aopdemo.service.MyService;
import com.example.springbootaop.aopdemo.service.MyServiceInt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AopDemoApplication {

    private final MyServiceInt myService;

    public AopDemoApplication(MyServiceInt myService) {
        this.myService = myService;
    }

    public static void main(String[] args) {
        SpringApplication.run(AopDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> myService.method1();
    }
}
