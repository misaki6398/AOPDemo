package com.oracle.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {
    public void addAccount() {
        System.out.println(getClass()+": DOING MY DB WORK: ADDING AN MEMBERSHIP ACCOUNT");
    }
}
