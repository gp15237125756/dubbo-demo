package com.dubbo.learn.java;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.common.extension.Adaptive;

@Adaptive
public class MarcoRubio implements SayHello{
    @Override
    public void sayHello() {
        System.out.println("the ZTE is doing harm to our country!");
    }
}
