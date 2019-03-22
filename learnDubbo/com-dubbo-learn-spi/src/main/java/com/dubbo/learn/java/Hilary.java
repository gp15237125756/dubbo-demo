package com.dubbo.learn.java;


import com.alibaba.dubbo.common.extension.Adaptive;


public class Hilary implements SayHello{
    @Override
    public void sayHello() {
        System.out.println("Trump is pig!");
    }
}
