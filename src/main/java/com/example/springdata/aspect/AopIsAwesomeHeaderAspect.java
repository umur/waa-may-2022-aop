package com.example.springdata.aspect;

import com.example.springdata.exception.AopIsAwesomeHeaderException;
import lombok.AllArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@AllArgsConstructor
public class AopIsAwesomeHeaderAspect {
    private HttpServletRequest request;

    @Pointcut("within(com.example.springdata.controller..*)")
    public void controller() {
    }

    @Around("controller()")
    public Object checkingAopIsAwesomeHeader(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(request.getMethod());
        System.out.println(request.getHeader("AOP-IS-AWESOME"));
        if (request.getMethod().equals(HttpMethod.POST.name()) && request.getHeader("AOP-IS-AWESOME") == null) {
            throw new AopIsAwesomeHeaderException("AOP-IS-AWESOME header is missing");
        }

        return joinPoint.proceed();
    }
}
