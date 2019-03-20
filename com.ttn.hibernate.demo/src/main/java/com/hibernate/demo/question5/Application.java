/**
 * Question 5:
 * Mark lastName as @Transient
 * Use @Temporal for date of birth of Author
 */

package com.hibernate.demo.question5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/question5.hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        // Create author
        Author5 author = new Author5();
        author.setFirstName("Roald");
        author.setLastName("Dahl");
        author.setAge(74);
        author.setId(1);
        author.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        System.out.println("Author5 created: " + author.toString());
        
        session.close();
        sessionFactory.close();
    }
}
