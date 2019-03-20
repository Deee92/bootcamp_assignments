/**
 * Question 3:
 * Perform hbm2ddl create-drop by closing session factory
 */

package com.hibernate.demo.question3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/question3.hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        // Create author
        Author3 author1 = new Author3();
        author1.setFirstName("Douglas");
        author1.setLastName("Adams");
        author1.setAge(49);
        author1.setId(1);
        author1.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author1);
        session.getTransaction().commit();
        System.out.println("Author3 created: " + author1.toString());
        
        session.close();
        // Drop table
        sessionFactory.close();
    }
}
