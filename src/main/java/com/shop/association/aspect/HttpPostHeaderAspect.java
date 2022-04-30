package com.shop.association.aspect;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@RequiredArgsConstructor
public class HttpPostHeaderAspect {

    private final HttpServletRequest httpServletRequest;

    @Pointcut(value  ="execution(* com.shop.association.service.impl..*(..))")
    public void postHeaderAspect() {
    }

    @Around("postHeaderAspect()")
    public Object logging(ProceedingJoinPoint jp) throws Throwable {
        if(httpServletRequest.getMethod().equals("POST") && httpServletRequest.getHeader("AOP-IS-AWESOME")==null){
            throw new AopIsAwesomeHeaderException("Header is required");
        }
        return jp.proceed();
    }


}
