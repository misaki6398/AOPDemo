package com.oracle.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.oracle.aopdemo.vo.Account;

@Component
public class AccountDao {
    public void addAccount(Account account) {
        System.out.println(getClass()+": DOING MY DB WORK: ADDING AN ACCOUNT");
    }
}
