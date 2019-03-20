/**
 * Question 11:
 * Demonstrate the use of the following options of @Transactional annotation:
 * read-only
 * timeout
 * rollback-for
 * no-rollback-for
 */

package com.spring.data.question11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question11 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-question-11.xml");
        Question11UserDao1 question11UserDao1 = context.getBean(Question11UserDao1.class);
        question11UserDao1.deleteUser("man");
//      question11UserDao1.txnReadOnly();
//      question11UserDao1.txnTimeOut();
//      question11UserDao1.txnRollbackFor();
//      question11UserDao1.txnNoRollbackFor();
    }
}
