package geektime.spring.hello.hellospring.Starer;

import org.springframework.stereotype.Component;

@Component
public class starImpl implements star {
    @Override
    public void act() {
        System.out.println("我其实是一个演员");
    }
}
