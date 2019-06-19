package geektime.spring.hello.hellospring.Dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("newCookies")
public class cookies implements Dessert{
    @Override
    public void say() {
        System.out.println("我是饼干");
    }
}
