/**
 * Question 1:
 * Create a class Author with instance variables firstName, lastName, and age
 * Perform CRUD operations for Author class
 */

package com.hibernate.demo.question1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/question1.hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        // Create author
        Author1 author = new Author1();
        author.setFirstName("JK");
        author.setLastName("Rowling");
        author.setAge(53);
        author.setId(1);
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        System.out.println("Author1 created: " + author.toString());
        
        // Read author
        session.beginTransaction();
        Author1 author1 = session.get(Author1.class, 1);
        session.getTransaction().commit();
        System.out.println("Author1 read: " + author1.toString());
        
        // Update author
        session.beginTransaction();
        Author1 author2 = session.get(Author1.class, 1);
        author.setFirstName("Joanne K");
        session.update(author2);
        session.getTransaction().commit();
        System.out.println("Author1 updated: " + author2.toString());
        
        // Delete author
        session.beginTransaction();
        Author1 author3 = session.get(Author1.class, 1);
        session.delete(author3);
        session.getTransaction().commit();
        session.close();
        System.out.println("Author1 deleted: " + author3.toString());
        
        sessionFactory.close();
    }
}
