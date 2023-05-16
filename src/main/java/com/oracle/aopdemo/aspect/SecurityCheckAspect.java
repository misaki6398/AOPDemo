package com.oracle.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.oracle.aopdemo.vo.Account;

@Aspect
@Component
@Order(2)
public class SecurityCheckAspect {
    @Before("execution(public void addAccount(..))")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("\n ==> Checking the authenticate before addAccount() run");

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        System.out.println("Method " + signature);

        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            if (arg instanceof Account) {
                System.out.println("Print the argument:" + arg);
                Account account = (Account) arg;
                System.out.println("Account name:" + account.getName());
                System.out.println("Account level:" + account.getLevel());
            }
        }
    }
}
