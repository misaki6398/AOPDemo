package com.oracle.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
    @Before("execution(public void addAccount(..))")
    public void beforeAddAccountAdvice() {
        System.out.println("\n ==> Executing @Before advice on addAccount()");
    }

    @Before("execution(public void com.oracle.aopdemo.dao.AccountDao.addAccount(..))")
    public void beforeAddAccountAdvice2() {
        System.out.println("\n ==> Executing @Before advice only on accountdao addAccount()");
    }

    @Pointcut("execution(* com.oracle.aopdemo.dao.*.*(..))")
    private void forDaoPackageUse() {
    }

    @Before("forDaoPackageUse()")
    public void beforeforDaoUse() {
        System.out.println("\n ==> Executing @Before for Dao use");
    }
}
