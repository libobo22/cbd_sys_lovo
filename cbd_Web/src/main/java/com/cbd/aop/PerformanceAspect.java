package com.cbd.aop;

import com.cbd.annotation.PerformanceAnno;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 响应性能切面类
 */
//@Component
//@Aspect
public class PerformanceAspect {

    @Around("@annotation(com.cbd.annotation.PerformanceAnno)")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint){
        long startTime=System.currentTimeMillis();
        //获取具体被拦截的方法
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method=methodSignature.getMethod();
        //获取该方法上的PerformanceAnno注解
        PerformanceAnno performanceAnno=method.getAnnotation(PerformanceAnno.class);
        Object result = null;
        try {
            result=joinPoint.proceed();
            long endTime=System.currentTimeMillis();
            long t=endTime-startTime;
            System.out.println(performanceAnno.info());
            System.out.println(performanceAnno.type());
            System.out.println(method.getName());
            System.out.println(t);
            //将以上四个封装到响应性能实体类中，然后插入到数据库中
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }

}
