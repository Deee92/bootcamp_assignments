/**
 * Question 6:
 * Use QueryForMap to fetch the user details of the  user
 */

package com.spring.data.question6;

import com.spring.data.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question6 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-question-6.xml");
        Question6UserDao question6UserDao = context.getBean(Question6UserDao.class);
        question6UserDao.userQueryForMap();
    }
}

