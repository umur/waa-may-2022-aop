package com.example.aop.aspect;

import com.example.aop.entity.Activity;
import com.example.aop.service.LogService;
import lombok.AllArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
@AllArgsConstructor
public class AspectLogger {
    private final LogService logService;

    @Pointcut("@annotation(com.example.aop.aspect.annotation.Logger)")
    public void logMeAnnotation(){}

    @Around("logMeAnnotation()")
    public void logMeAnnotation(JoinPoint joinPoint) {
        Activity activity = new Activity();
        activity.setDate(LocalDateTime.now());
        activity.setOperation(joinPoint.getSignature().getName());
        logService.save(activity);
        System.out.println("Method Name : " + joinPoint.getSignature().getName());
    }
}
