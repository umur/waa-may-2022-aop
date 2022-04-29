package com.webshop.mapping.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class PostRequestValidatorAspect {

    private HttpServletRequest httpServletRequest;

    PostRequestValidatorAspect(HttpServletRequest httpServletRequest){
        this.httpServletRequest = httpServletRequest;
    }

    @Pointcut(value  ="execution(* com.webshop.mapping.service.impls..*(..))")
    public void getPointCut() {
    }

    @Around("getPointCut()")
    public Object logging(ProceedingJoinPoint jp) throws Throwable {
        if(httpServletRequest.getMethod().equals("POST") && httpServletRequest.getHeader("AOP-IS-AWESOME")==null){
            throw new AopIsAwesomeHeaderException("Header is required");
        }
        return jp.proceed();
    }

}
