/**
 * Question 6:
 * Generate Id for Author Using IDENTITY and TABLE strategy
 */

package com.hibernate.demo.question6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/question6.hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        // Create author with IDENTITY Id generation strategy
        Author6A author1 = new Author6A();
        author1.setFirstName("Alexander");
        author1.setLastName("Dumas");
        author1.setAge(68);
        author1.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author1);
        session.getTransaction().commit();
        System.out.println("Author6A created: " + author1.toString());
        
        // Create author with TABLE Id generation strategy
        Author6B author2 = new Author6B();
        author2.setFirstName("Oscar");
        author2.setLastName("Wilde");
        author2.setAge(68);
        author2.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author2);
        session.getTransaction().commit();
        System.out.println("Author6B created: " + author2.toString());
        
        session.close();
        sessionFactory.close();
    }
}
