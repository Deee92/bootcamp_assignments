/**
 * Question 7:
 * Create a class Address for Author with instance variables streetNumber, location, State.
 * Create instance variable of Address class inside Author class and save it as embedded object.
 */

package com.hibernate.demo.question7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/question7.hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        // Create author
        Author7 author = new Author7();
        author.setFirstName("Neil deGrasse");
        author.setLastName("Tyson");
        author.setAge(60);
        author.setId(1);
        author.setDateOfBirth(new Date());
        Address address = new Address();
        address.setState("New York");
        address.setStreetNumber("200, Central Park West");
        address.setLocation("United States of America");
        author.setAddress(address);
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        System.out.println("Author7 created: " + author.toString());
        
        session.close();
        sessionFactory.close();
    }
}
