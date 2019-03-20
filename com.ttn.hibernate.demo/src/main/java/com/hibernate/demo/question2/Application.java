/**
 * Question 2:
 * Use hbm2ddl create to introduce Date of Birth for Author
 */

package com.hibernate.demo.question2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/question2.hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        // Create author1
        Author2 author1 = new Author2();
        author1.setFirstName("Arthur Conan");
        author1.setLastName("Doyle");
        author1.setAge(71);
        author1.setId(1);
        author1.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author1);
        session.getTransaction().commit();
        System.out.println("Author2 created: " + author1.toString());
        
        session.close();
        sessionFactory.close();
    }
}
