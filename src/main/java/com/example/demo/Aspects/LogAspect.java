package com.example.demo.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@Component
@EnableAspectJAutoProxy
public class LogAspect {
    @Around("@annotation(MyLog)")
    public void Log(ProceedingJoinPoint proceedingJoinPoint, JoinPoint joinPoint) throws Throwable {
        double t1 = System.currentTimeMillis();
        System.out.println("Commencement d'execution de "+joinPoint.getSignature().getName());
        proceedingJoinPoint.proceed();
        double t2 = System.currentTimeMillis();
        System.out.println("Fin d'execution de "+joinPoint.getSignature().getName()+" dans "+(t2-t1)+"s");
    }

}
