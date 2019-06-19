package geektime.spring.hello.hellospring.Starer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class starPoint {
    @DeclareParents(value = "geektime.spring.hello.hellospring.Starer.Performance+", defaultImpl = geektime.spring.hello.hellospring.Starer.starImpl.class)
    public static star starl;
}
