package com.has.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
    @Pointcut("@annotation(com.has.aop.aspect.annotation.ActivityLog)")
    public void activityLogAnnotation(){}

    @Before("activityLogAnnotation()")
    public void log(JoinPoint joinPoint){
        System.out.println("Method Name: " + joinPoint.getSignature().getName());
        System.out.println("ID: " + joinPoint.getStaticPart().getId());

    }
}
