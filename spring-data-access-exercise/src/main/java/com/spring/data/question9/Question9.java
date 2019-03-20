/**
 * Question 9:
 * Integrate Hibernate with Spring and use hql query to count the number of records in user table
 */

package com.spring.data.question9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question9 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-question-9.xml");
        DogDao dogDao = context.getBean(DogDao.class);
        dogDao.getDogCountWithHibernate();
    }
}

