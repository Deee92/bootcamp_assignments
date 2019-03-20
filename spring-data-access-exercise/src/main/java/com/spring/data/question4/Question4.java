/**
 * Question 4:
 * Get name of the user by providing username to the parameterized query
 */

package com.spring.data.question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question4 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-question-4.xml");
        Question4UserDao question4UserDao = context.getBean(Question4UserDao.class);
        System.out.println(question4UserDao.getUserNameWithJdbc());
    }
}

