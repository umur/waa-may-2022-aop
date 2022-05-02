package edu.miu.springaop.aspect;

import edu.miu.springaop.DTO.ActivityLogDto;
import edu.miu.springaop.entity.ActivityLog;
import edu.miu.springaop.service.ActivityLogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServlet;
import java.time.LocalDate;

@Aspect
@Component
public class ExecutionTimeAspect {

    @Autowired
    private ActivityLogService activityLogService;

  @Pointcut("@annotation(edu.miu.springaop.aspect.annotation.ExecutionTime)")
    public void executionTimeAnnotation() {}

    @Around("executionTimeAnnotation()")
    public Object calculateExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.nanoTime();
        var result = proceedingJoinPoint.proceed();
        long finish = System.nanoTime();
        System.out.println(proceedingJoinPoint.getSignature().getName() + " takes ns: " + (finish - start));

        LocalDate now = LocalDate.now();
        String operation = proceedingJoinPoint.getSignature().getDeclaringType().getSimpleName() + " ---- " + proceedingJoinPoint.getSignature().getName();
        double duration = finish - start;

        ActivityLogDto a = new ActivityLogDto(now, operation, duration);
        activityLogService.save(a);

        return result;
    }
}
