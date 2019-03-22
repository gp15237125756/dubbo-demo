package com.dubbo.learn.service;

import com.alibaba.dubbo.common.compiler.support.ClassUtils;
import com.alibaba.dubbo.common.utils.ReflectUtils;
import com.dubbo.learn.facade.MakeCar;
import org.springframework.stereotype.Service;

@Service("japan")
public class Japan implements MakeCar {
    @Override
    public String make(String name) {
        if (name!=null) {
            return  name;
        }
        return null;
    }
}
