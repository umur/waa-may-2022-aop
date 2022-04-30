package com.example.lab2.aspect;

import com.example.lab2.aspect.exceptions.AopIsAwesomeHeaderException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

@Aspect
@Component
public class CheckPostAspect {

    @Before("execution(* com.example.lab2.service.*.*(..))")
    public void checkPost(JoinPoint joinPoint) throws AopIsAwesomeHeaderException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        if (request.getMethod().equalsIgnoreCase("post")){
            Map<String, String> headers = Collections.list(request.getHeaderNames()).stream().collect(Collectors.toMap(h -> h, request::getHeader));
            boolean[] containHeader = new boolean []{false};

            headers.forEach((k, v) -> {
                if (k.equalsIgnoreCase("AOP-IS-AWESOME") || v.equalsIgnoreCase("AOP-IS-AWESOME"))
                    containHeader[0] = true;
            });

            if(!containHeader[0]){
                throw new AopIsAwesomeHeaderException("Exception Aop Is AwesomeHeader");
            }
        }

    }

}
