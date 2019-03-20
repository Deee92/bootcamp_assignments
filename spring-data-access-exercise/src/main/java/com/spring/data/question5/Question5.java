/**
 * Question 5:
 * Insert one record using JdbcTemplate
 */

package com.spring.data.question5;

import com.spring.data.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Question5 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-question-5.xml");
        Question5UserDao question5UserDao = context.getBean(Question5UserDao.class);
        User user = new User("loremipsum", "789", "Lorem Ipsum", 44, new Date());
        question5UserDao.insertUserWithJdbc(user);
    }
}

