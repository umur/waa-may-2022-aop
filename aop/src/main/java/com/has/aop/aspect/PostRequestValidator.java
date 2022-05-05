package com.has.aop.aspect;

import com.has.aop.aspect.annotation.PostHeaderExeption;
import com.has.aop.entity.ActivityLog;
import com.has.aop.service.ActivityLogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Aspect
@Component
public class PostRequestValidator {
    private final ActivityLogService activityLogService;
    private final HttpServletRequest httpServlet;



    public PostRequestValidator(ActivityLogService activityLogService, HttpServletRequest httpServlet) {
        this.activityLogService = activityLogService;
        this.httpServlet = httpServlet;
    }

    @Pointcut(value  ="execution(* com.has.aop.service.impl..*(..))")
    public void getPointCut() {
    }

    @Around("getPointCut()")
    public Object calculateExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        if(httpServlet.getMethod().equals("POST") && httpServlet.getHeader("AOP-IS-AWESOME")==null) {
            throw new PostHeaderExeption("AOP-IS-AWESOME header is not present ");
        }
       return proceedingJoinPoint.proceed();
    }
}
