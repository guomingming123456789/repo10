package cn.itheima.poxy;

import cn.itheima.anno.MyAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;



public class Aspect {
    public void before(){
        System.out.println("前置增强---------");
    }
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前---");
        pjp.proceed();
        System.out.println("环绕后-----");
    }
    public void after(){
        System.out.println("最终增强------");
    }
}
