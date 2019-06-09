package cn.itheima.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {
    @Before("execution(* cn.itheima.anno.*.*(..))")
    public void before(){
        System.out.println("前置增强---------");
    }
@Around("MyAspect.ttt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前---");
        pjp.proceed();
        System.out.println("环绕后-----");
    }
    @AfterReturning("ttt()")
    public void after(){
        System.out.println("最终增强------");
    }
    @Pointcut("execution(* cn.itheima.anno.*.*(..))")
    public void ttt(){}
}
