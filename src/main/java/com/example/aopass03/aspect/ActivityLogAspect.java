package com.example.aopass03.aspect;

import com.example.aopass03.domain.ActivityLog;
import com.example.aopass03.repository.ActivityLogRepo;
import lombok.AllArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Aspect
@Component
@AllArgsConstructor
public class ActivityLogAspect {
    private ActivityLogRepo activityLogRepo;

    @Pointcut("@annotation(com.example.aopass03.aspect.ExecutionTime)")
    public void executionTimeAnnotation() {
    }

    @Around("executionTimeAnnotation()")
    public Object calculateExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.nanoTime();
        var result = proceedingJoinPoint.proceed();
        long finish = System.nanoTime();
        ActivityLog aLog = new ActivityLog(LocalDate.now(), ("method:" + proceedingJoinPoint.getSignature().getName()), finish - start);
        activityLogRepo.save(aLog);
        return result;
    }
}
