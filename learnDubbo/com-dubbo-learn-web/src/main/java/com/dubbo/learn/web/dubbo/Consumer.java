package com.dubbo.learn.web.dubbo;

import com.dubbo.learn.facade.MakeCar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        context.start();
        MakeCar demoService = (MakeCar)context.getBean("japan"); // 获取远程服务代理
        String movie = demoService.make("movie");// 执行远程方法
        System.out.println(movie);
    }
}
