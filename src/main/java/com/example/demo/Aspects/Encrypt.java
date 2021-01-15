package com.example.demo.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Base64;


@Aspect
@Component
@EnableAspectJAutoProxy
public class Encrypt {
   @Before("@annotation(encCrypt)")
    public void Encrypt(JoinPoint jp , EncCrypt encCrypt) throws Throwable {
        Object object = jp.getArgs()[0];
        for(String attribut : encCrypt.attributs()){
           Field f = object.getClass().getDeclaredField(attribut);
           f.setAccessible(true);
           Object Value = f.get(object);
           System.out.println("valeur :"+Value);
           System.out.println("Crypter :"+Base64.getEncoder().encodeToString(Value.toString().getBytes()));
           f.set(object,Base64.getEncoder().encodeToString(Value.toString().getBytes()));
        }
    }
}
