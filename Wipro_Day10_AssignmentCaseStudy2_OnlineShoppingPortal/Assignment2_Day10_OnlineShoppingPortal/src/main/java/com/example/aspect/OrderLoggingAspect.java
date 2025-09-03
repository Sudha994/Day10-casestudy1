package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderLoggingAspect {

	@Before("execution(* com.example.service.OrderService.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        System.out.println("Before executing: " + joinPoint.getSignature().getName());
    }

	    @AfterReturning(pointcut = "execution(* com.example.shopping.service.OrderService.*(..))", 
	                   returning = "result")
	    public void logMethodSuccess(JoinPoint joinPoint, Object result) {
	        System.out.println("Method " + joinPoint.getSignature().getName() + 
	                         " executed successfully");
	    }

	    @AfterThrowing(pointcut = "execution(* com.example.shopping.service.OrderService.*(..))", 
	                  throwing = "error")
	    public void logMethodError(JoinPoint joinPoint, Throwable error) {
	        System.out.println("Exception in method: " + joinPoint.getSignature().getName() + 
	                         " with message: " + error.getMessage());
	    }

	    @After("execution(* com.example.shopping.service.OrderService.*(..))")
	    public void logMethodExit(JoinPoint joinPoint) {
	        System.out.println("Exiting method: " + joinPoint.getSignature().getName());
	    }
}
