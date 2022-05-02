package com.example.datademo.aspect;

import com.example.datademo.entity.ActivityLog;
import com.example.datademo.error.AopIsAwesomeHeaderException;
import com.example.datademo.repository.ActivityLogRepository;
import com.example.datademo.service.ActivityLogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Aspect
@Component
public class ExecutionTimeAspect {
    @Autowired
    private ActivityLogService activityLogService;
    @Autowired
    private HttpServletRequest httpServletRequest;
    @Pointcut("@annotation(com.example.datademo.annotation.ExecutionTime)")
    public void executionTime() {
    }
    @Around("executionTime()")
    public Object logging(ProceedingJoinPoint jp) throws Throwable{
        long start = System.nanoTime();
        var result = jp.proceed();
        long finish = System.nanoTime();
        ActivityLog al = new ActivityLog();
        al.setDate(LocalDate.now());
        al.setDuration(finish);
        al.setOperation(httpServletRequest.getMethod()+":"+httpServletRequest.getRequestURI());
        activityLogService.save(al);
        return result;
    }
}
