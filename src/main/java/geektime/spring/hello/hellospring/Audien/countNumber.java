package geektime.spring.hello.hellospring.Audien;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class countNumber {
    private static int i = 0;
    @Pointcut("execution(* geektime.spring.hello.hellospring.interfaces.Performance.sing(int))"+"&& args(i)")
    public void sing(int i){}
    @Before("sing(j)")
    public void  count(int j){
        System.out.println("演出开始 场数加1");
        i++;
        System.out.println("[演出场次]"+i);
    }
}
