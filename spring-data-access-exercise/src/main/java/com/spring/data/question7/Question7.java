/**
 * Question 7:
 * Use QueryForList to fetch records of all users
 */

package com.spring.data.question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question7 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-question-7.xml");
        Question7UserDao question7UserDao = context.getBean(Question7UserDao.class);
        question7UserDao.userQueryForList();
    }
}

