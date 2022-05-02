package edu.miu.springaop.aspect;

import edu.miu.springaop.DTO.ActivityLogDto;
import edu.miu.springaop.exception.AopIsAwesomeHeaderException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


@Aspect
@Component
public class AopIsAwesomeAspect {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Pointcut("within(edu.miu.springaop.service..*)")
    private static void aopIsAwesome(){}

    @Before("aopIsAwesome()")
    public void aopIsAwesomeAspectAdvice(JoinPoint joinPoint) throws Throwable {

        if( httpServletRequest.getMethod().equals("POST") && (httpServletRequest.getHeader("AOP-IS-AWESOME") == null)) {
            throw new AopIsAwesomeHeaderException("No header AOP-IS-AWESOME found");
        }

    }


}
