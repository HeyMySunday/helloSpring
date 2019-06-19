package geektime.spring.hello.hellospring.Audien;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
    @Pointcut("execution(* geektime.spring.hello.hellospring.interfaces.Performance.perform(..))")
    public void perform(){}
    @Before("execution(* geektime.spring.hello.hellospring.interfaces.Performance.perform(..))")
    public void  turnoffphone(){
        System.out.println("演出前关手机");
    }
    @Before("execution(* geektime.spring.hello.hellospring.interfaces.Performance.perform(..))")
    public void setSeat(){
        System.out.println("演出前找位置坐");
    }
    @AfterReturning("execution(* geektime.spring.hello.hellospring.interfaces.Performance.perform(..))")
    public void applause(){
        System.out.println("演出后鼓掌");
    }
    @AfterThrowing("execution(* geektime.spring.hello.hellospring.interfaces.Performance.perform(..))")
    public void xuRufu(){
        System.out.println("演出失败后嘘声");
    }
    @Around("perform()")
    public void around(ProceedingJoinPoint jp){
        System.out.println("环绕演出 演出前来一次");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕演出 演出后来一次");
    }
}
