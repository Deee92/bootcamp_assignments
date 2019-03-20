/**
 * Question 8:
 * Use a RowMapper to get the User object when you query for a user
 */

package com.spring.data.question8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question8 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-question-8.xml");
        Question8UserDao question8UserDao = context.getBean(Question8UserDao.class);
        System.out.println(question8UserDao.getUserFromMapper());
    }
}

