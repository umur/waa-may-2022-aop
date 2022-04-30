package com.example.springdata.aspect;

import com.example.springdata.entity.ActivityLog;
import com.example.springdata.repository.ActivityLogRepository;
import lombok.AllArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;
import java.time.LocalDateTime;
import java.util.Date;

@Component
@Aspect
@AllArgsConstructor
public class ActivityLogAspect {

    private ActivityLogRepository activityLogRepository;

    @Around("@annotation(com.example.springdata.annotation.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");

        ActivityLog activityLog = new ActivityLog();
        activityLog.setDate(LocalDateTime.now());
        activityLog.setDuration(executionTime);
        activityLog.setOperation(joinPoint.getSignature().toShortString());
        activityLogRepository.save(activityLog);

        return proceed;
    }
}
