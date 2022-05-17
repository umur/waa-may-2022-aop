package com.example.aopass03.aspect;

import lombok.AllArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@AllArgsConstructor
public class PostRequestValidatorAspect {
    private HttpServletRequest httpServletRequest;

    @Pointcut(value  ="execution(* com.webshop.mapping.service.impls..*(..))")
    public void getPointCut() {
    }

    @Around("getPointCut()")
    public Object logging(ProceedingJoinPoint jp) throws Throwable {
        if(httpServletRequest.getMethod().equals("POST") && httpServletRequest.getHeader("AOP-IS-AWESOME")==null){
            throw new AopAwesomeHeaderException("Header is required");
        }
        return jp.proceed();
    }
}
