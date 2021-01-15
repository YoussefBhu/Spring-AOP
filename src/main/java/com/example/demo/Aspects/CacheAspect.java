package com.example.demo.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


@Aspect
@Component
@EnableAspectJAutoProxy
public class CacheAspect {
   private Logger logger=Logger.getLogger(LogAspect.class.getName());

    public CacheAspect() throws IOException {
        logger.addHandler(new FileHandler("Cache1.xml"));
        logger.setUseParentHandlers(false);
    }

    @Around("@annotation(CachableAspect)")
    public void MakeCache(ProceedingJoinPoint proceedingJoinPoint, JoinPoint joinPoint) throws Throwable {
        double t1 = System.currentTimeMillis();
        logger.info("Commencement d'execution de "+joinPoint.getSignature());
        proceedingJoinPoint.proceed();
        double t2 = System.currentTimeMillis();
        logger.info("Fin d'execution de "+joinPoint.getSignature()+" dans "+(t2-t1)+"s");
    }

}
