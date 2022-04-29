package com.webshop.mapping.aspect;

import com.webshop.mapping.domain.ActivityLog;
import com.webshop.mapping.repository.ActivityLogRepository;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Aspect
@Component
public class ActivityLogAspect {

    private ActivityLogRepository activityLogRepository;

    public ActivityLogAspect(ActivityLogRepository activityLogRepository){
        this.activityLogRepository = activityLogRepository;
    }

    @Pointcut("@annotation(com.webshop.mapping.aspect.ExecutionTime)")
    public void executionTimeAnnotation() {
    }

    @Around("executionTimeAnnotation()")
    public Object calculateExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.nanoTime();
        var result = proceedingJoinPoint.proceed();
        long finish = System.nanoTime();
        String packageName = proceedingJoinPoint.getSignature().getDeclaringTypeName();
        String methodName = proceedingJoinPoint.getSignature().getName();
        ActivityLog activityLog = new ActivityLog(LocalDate.now(),String.format("Class: %s, method: %s",packageName,methodName),finish-start);
        activityLogRepository.save(activityLog);
        return result;
    }

}
