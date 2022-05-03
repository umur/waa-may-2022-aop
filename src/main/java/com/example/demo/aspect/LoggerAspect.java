package com.example.demo.aspect;

import com.example.demo.entity.bidirect.ActivityLog;
import com.example.demo.service.ActivityLogService;
import jdk.jfr.Timespan;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Aspect
@Component
@AllArgsConstructor
public class LoggerAspect {
 private final ActivityLogService activityLogService;
    @Pointcut("@annotation(com.example.demo.aspect.annontation.LogMe)")
    public void logMeannotation1(){}

    @Around("logMeannotation1()")
    public void logMeannotation(JoinPoint joinPoint) {
        //  Timespan t= new Timespan();
        ActivityLog ac = new ActivityLog();
        ac.setDate(LocalDateTime.now());
        ac.setOperation(joinPoint.getSignature().getName());
        activityLogService.save(ac);
        System.out.println("Method Name: " + joinPoint.getSignature().getName());
    }
}
