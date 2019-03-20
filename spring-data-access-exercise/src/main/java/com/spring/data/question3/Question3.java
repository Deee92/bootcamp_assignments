/**
 * Question 3:
 * Use JdbcTemplate to get the count of users
 */

package com.spring.data.question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-question-3.xml");
        Question3UserDao question3UserDao = context.getBean(Question3UserDao.class);
        question3UserDao.userCountWithJdbc();
    }
}

