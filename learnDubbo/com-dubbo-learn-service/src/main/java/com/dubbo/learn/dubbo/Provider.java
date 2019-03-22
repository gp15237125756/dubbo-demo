package com.dubbo.learn.dubbo;

import com.alibaba.dubbo.config.spring.ServiceBean;
import com.dubbo.learn.facade.MakeCar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        context.start();
        System.in.read();
    }
}
