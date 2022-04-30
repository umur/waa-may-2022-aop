package com.shop.association.aspect;

import com.shop.association.domain.ActivityLog;
import com.shop.association.repository.ActivityLogRepo;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Aspect
@Component
@RequiredArgsConstructor
public class ActivityLogAspect {

    private final ActivityLogRepo activityLogRepo;

    @Pointcut("@annotation(com.shop.association.aspect.ExecutionTime)")
    public void executionTimeAnnotation() {
    }

    @Around("executionTimeAnnotation()")
    public Object calculateExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.nanoTime();
        var result = proceedingJoinPoint.proceed();
        long finish = System.nanoTime();
        ActivityLog activityLog = new ActivityLog(LocalDate.now(),("method:" + proceedingJoinPoint.getSignature().getName()),finish-start);
        activityLogRepo.save(activityLog);
        return result;
    }



}
