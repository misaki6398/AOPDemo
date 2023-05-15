package com.oracle.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Aspect
@Component
@Order(2)
public class SecurityCheckAspect {
    @Before("execution(public void addAccount(..))")
    public void beforeAddAccountAdvice() {
        System.out.println("\n ==> Checking the authenticate before addAccount() run");
    }
}
