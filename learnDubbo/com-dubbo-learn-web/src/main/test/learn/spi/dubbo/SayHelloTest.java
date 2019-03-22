package learn.spi.dubbo;

import com.alibaba.dubbo.common.extension.ExtensionFactory;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.dubbo.learn.java.SayHello;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SayHelloTest {

    private ServiceLoader<ExtensionFactory> factoryServiceLoader = ServiceLoader.load(ExtensionFactory.class);

    private ServiceLoader<SayHello> serviceLoader = ServiceLoader.load(SayHello.class);

    @Test
    public void fac() {
        ExtensionLoader<ExtensionFactory> extensionLoader =
                ExtensionLoader.getExtensionLoader(ExtensionFactory.class);
        ExtensionFactory adaptiveExtension = extensionLoader.getAdaptiveExtension();
        //获取adaptiva extension ,如果实现类都没有@Adaptive 则调用失败
        SayHello hilary = adaptiveExtension.getExtension(SayHello.class, "hilary");
        hilary.sayHello();
    }

    @Test
    public void sayHello() {
        ExtensionLoader<SayHello> extensionLoader =
                ExtensionLoader.getExtensionLoader(SayHello.class);
        SayHello optimusPrime = extensionLoader.getExtension("hilary");
        optimusPrime.sayHello();
        SayHello adaptiveExtension = extensionLoader.getAdaptiveExtension();
        adaptiveExtension.sayHello();
        SayHello bumblebee = extensionLoader.getExtension("marcoRubio");
        bumblebee.sayHello();

    }
}
