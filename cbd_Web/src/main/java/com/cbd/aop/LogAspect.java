package com.cbd.aop;

import com.cbd.annotation.LogAnno;
import com.cbd.utils.IPUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

/**
 * 日志切面类
 */
//@Component
//@Aspect
public class LogAspect {

    @Around("@annotation(com.cbd.annotation.LogAnno)")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint){
        //获取被拦截的方法
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method=methodSignature.getMethod();
        //获取session
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request=attr.getRequest();
        HttpSession session=request.getSession(true);
        //通过session获取当前登录用户的，然后获取登录名


        //获取被拦截方法上的logAnno注解
        LogAnno logAnno=method.getAnnotation(LogAnno.class);
        String logInfo=logAnno.logInfo();
        int logType=logAnno.logType();
        int operationType=logAnno.logType();
        String ip= IPUtil.getIpAddr(request);

        Object result = null;
        try {
            result=joinPoint.proceed();
            //将上面的信息封装到log实体类中，存入数据库

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }

}
