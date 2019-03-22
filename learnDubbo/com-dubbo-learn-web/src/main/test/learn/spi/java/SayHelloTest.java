package learn.spi.java;

import com.dubbo.learn.java.SayHello;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SayHelloTest {

    private ServiceLoader<SayHello> serviceLoader = ServiceLoader.load(SayHello.class);

    @Test
    public void sayHello(){
        Iterator<SayHello> iterator = serviceLoader.iterator();
        while(iterator.hasNext()){
            SayHello sayHello = iterator.next();
            sayHello.sayHello();
        }
    }
}
