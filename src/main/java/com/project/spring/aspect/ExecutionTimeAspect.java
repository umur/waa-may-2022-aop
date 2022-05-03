package com.project.spring.aspect;

import com.project.spring.entity.ActivityLog;
import com.project.spring.service.ActivityLogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Aspect
@Component
public class ExecutionTimeAspect {

    private final ActivityLogService activityLogService;

    public ExecutionTimeAspect(ActivityLogService activityLogService) {
        this.activityLogService = activityLogService;
    }

    @Pointcut("@annotation(com.project.spring.aspect.annotation.ExecutionTime)")
    public void init() {}

    @Around("init()")
    public void timeAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.nanoTime();
        var result = proceedingJoinPoint.proceed();
        long finish = System.nanoTime();
        long res = finish - start;
        ActivityLog activityLog = new ActivityLog();
        activityLog.setDate(LocalDate.now());
        activityLog.setDuration(res);
        String operation = proceedingJoinPoint.getTarget().getClass().getName()
                + " - "
                + proceedingJoinPoint.getSignature().getName();
        activityLog.setOperation(operation);
        activityLogService.save(activityLog);

    }

}
