package com.spring.intermediate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;

@Aspect
public class LoggingAspect {
    @Before("execution(* com.spring.intermediate.ServiceClass.*(..))")
    void beforeServiceLogAdvice() {
        System.out.println("=== Aspect advice running before all ServiceClass methods ===");
    }
    
    @After("execution(* com.spring.intermediate.ServiceClass.*(..))")
    void afterServiceLogAdvice() {
        System.out.println("=== Aspect advice running after all ServiceClass methods ===");
    }
    
    @AfterThrowing(pointcut = "execution(* *(..))", throwing = "e")
    void afterThrowingIOException(IOException e) {
        System.out.println("IOException thrown");
    }
    
    @After("within(com.spring.intermediate.*)")
    void afterWithinAdvice() {
        System.out.println("=== Aspect advice running after all methods in com.spring.intermediate ===");
    }
    
    @After("args(int)")
    void afterArgAdvice() {
        System.out.println("=== Aspect advice running after someDatabaseMethod(int) ===");
    }
    
    @After("bean(serviceClassBean)")
    void afterBeanAdvice() {
        System.out.println("=== Aspect advice running after all methods in ServiceClassBean ===");
    }
    
    @After("this(com.spring.intermediate.ServiceClass)")
    void afterThisAdvice() {
        System.out.println("=== Aspect advice running after all methods in com.spring.intermediate.ServiceClass ===");
    }
    
    @Before("connectPointcut() || getStringPointcut()")
    void beforePointcutAdvice() {
        System.out.println("=== Aspect advice running before connectPointcut() || getStringPointcut() ===");
    }
    
    @After("connectPointcut()")
    void afterAdvice() {
        System.out.println("=== Aspect advice running after connectPointcut() ===");
    }
    
    @Pointcut("execution(void connect())")
    void connectPointcut() {
    }
    
    @Pointcut("execution(String getString())")
    void getStringPointcut() {
    }
    
    @Before("execution(int someIntMethod(int))")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("=== Aspect advice running before int someIntMethod(int) ===");
        System.out.println("Joinpoint for advice: " + joinPoint);
        System.out.println("Current object at joinpoint: " + joinPoint.getThis());
        System.out.println("Signature of method at joinpoint: " + joinPoint.getSignature());
        System.out.print("Arguments to method at joinpoint: ");
        Object[] objects = joinPoint.getArgs();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
    
}
