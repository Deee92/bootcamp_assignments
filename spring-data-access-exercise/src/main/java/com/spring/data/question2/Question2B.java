/**
 * Question 1:
 * Create database springDemo with user table and fields
 * (a) username
 * (b) password
 * (c) name
 * (d) age
 * (e) dob
 * Insert few records inside the user table
 * <p>
 * Question 2:
 * Use DataSource with SingleConnectionDataSource to print the records of user table
 */

package com.spring.data.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Question2B {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-question-2B.xml");
        Question2UserDao question2UserDao = context.getBean(Question2UserDao.class);
        try {
            question2UserDao.getUserName();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
