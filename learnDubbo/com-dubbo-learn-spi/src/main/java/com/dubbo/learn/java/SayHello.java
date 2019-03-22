package com.dubbo.learn.java;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface SayHello {

    void sayHello();
}
