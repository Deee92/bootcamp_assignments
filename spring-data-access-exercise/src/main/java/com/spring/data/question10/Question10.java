/**
 * Question 10:
 * Use @Transactional to save to save 2 records using JdbcTemplate with the following propagation options
 * REQUIRED
 * REQUIRES_NEW
 * NESTED
 * MANDATORY
 * NEVER
 * NOT_SUPPORTED
 * SUPPORTS
 */

package com.spring.data.question10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question10 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-question-10.xml");
        Question10UserDao1 question10UserDao1 = context.getBean(Question10UserDao1.class);
        question10UserDao1.deleteUser("man");
        // REQUIRED - MANDATORY
        // question10UserDao1.txnInsertUser1();
        
        // REQUIRED - REQUIRES NEW
        // question10UserDao1.txnInsertUser2();
        
        // REQUIRED - REQUIRED
        // question10UserDao1.txnInsertUser3();
        
        // REQUIRED - NOT_SUPPORTED
        // question10UserDao1.txnInsertUser4();
        
        // REQUIRED - NESTED
        // question10UserDao1.txnInsertUser5();
        
        // REQUIRED - NEVER
        // question10UserDao1.txnInsertUser6();
        
        // REQUIRED - SUPPORTS
        // question10UserDao1.txnInsertUser7();
    }
}
