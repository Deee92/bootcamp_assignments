/**
 * Question 2B:
 * Use hbm2ddl update to insert at least 4 records for Author
 */

package com.hibernate.demo.question2b;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/question2b.hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        // Create author1
        Author2B author1 = new Author2B();
        author1.setFirstName("Carl");
        author1.setLastName("Sagan");
        author1.setAge(62);
        author1.setId(1);
        author1.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author1);
        session.getTransaction().commit();
        System.out.println("Author2B created: " + author1.toString());
        
        // Create author2
        Author2B author2 = new Author2B();
        author2.setFirstName("CS");
        author2.setLastName("Lewis");
        author2.setAge(64);
        author2.setId(2);
        author2.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author2);
        session.getTransaction().commit();
        System.out.println("Author2B created: " + author2.toString());
        
        // Create author3
        Author2B author3 = new Author2B();
        author3.setFirstName("Enid");
        author3.setLastName("Blyton");
        author3.setAge(71);
        author3.setId(3);
        author3.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author3);
        session.getTransaction().commit();
        System.out.println("Author2B created: " + author3.toString());
        
        // Create author4
        Author2B author4 = new Author2B();
        author4.setFirstName("Andy");
        author4.setLastName("Weir");
        author4.setAge(46);
        author4.setId(4);
        author4.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author4);
        session.getTransaction().commit();
        System.out.println("Author2B created: " + author4.toString());
        
        session.close();
        sessionFactory.close();
    }
}
