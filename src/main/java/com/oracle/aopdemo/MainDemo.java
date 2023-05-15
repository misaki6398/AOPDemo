package com.oracle.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.oracle.aopdemo.dao.AccountDao;
import com.oracle.aopdemo.dao.MembershipDao;
import com.oracle.aopdemo.vo.Account;

public class MainDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
        MembershipDao membershipDao = context.getBean("membershipDao", MembershipDao.class);
        Account account = new Account();
        accountDao.addAccount(account);
        membershipDao.addAccount();
        context.close();
        
    }
}
