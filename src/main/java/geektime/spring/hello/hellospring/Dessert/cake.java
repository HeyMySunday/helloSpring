package geektime.spring.hello.hellospring.Dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("newCake")
public class cake implements Dessert{
    @Override
    public void say() {
        System.out.println("我是蛋糕"+cake.class);
    }
}
