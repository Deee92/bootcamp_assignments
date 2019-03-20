/**
 * Question 9:
 * Create an Entity book with an instance variable bookName
 * Question 9A:
 * Implement One to One mapping between Author and Book
 * Question 9B:
 * Implement One to Many Mapping between Author and Book
 * (Unidirectional, BiDirectional, and without additional table) and implement cascade save
 * Question 9C:
 * Implement Many to Many Mapping between Author and Book
 */

package com.hibernate.demo.question9;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/question9.hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        // OneToOne
        // Create author1
        Author9A author1 = new Author9A();
        author1.setFirstName("Lewis");
        author1.setLastName("Carroll");
        author1.setAge(65);
        author1.setId(1);
        author1.setDateOfBirth(new Date());
        BookA book1 = new BookA();
        book1.setBookName("Alice in Wonderland");
        book1.setId(100);
        author1.setBookA(book1);
        session.beginTransaction();
        session.save(author1);
        session.save(book1);
        session.getTransaction().commit();
        System.out.println("Author9A created: " + author1.toString());
        
        // Create author2
        Author9A author2 = new Author9A();
        author2.setFirstName("Charles");
        author2.setLastName("Dickens");
        author2.setAge(58);
        author2.setId(2);
        author2.setDateOfBirth(new Date());
        BookA book2 = new BookA();
        book2.setBookName("Great Expectations");
        book2.setId(101);
        author2.setBookA(book2);
        session.beginTransaction();
        session.save(author2);
        session.save(book2);
        session.getTransaction().commit();
        System.out.println("Author9A created: " + author2.toString());
        
        // OneToMany - Unidirectional
        
        // Create author3
        Author9B author3 = new Author9B();
        author3.setFirstName("Isaac");
        author3.setLastName("Asimov");
        author3.setAge(72);
        author3.setId(1);
        author3.setDateOfBirth(new Date());
        BookB book3 = new BookB();
        book3.setBookName("The Complete Stories - Volume 1");
        book3.setId(100);
        BookB book4 = new BookB();
        book4.setBookName("The Complete Stories - Volume 2");
        book4.setId(101);
        List<BookB> bookBList = Arrays.asList(book3, book4);
        author3.setBookBList(bookBList);
        session.beginTransaction();
        session.save(author3);
        session.save(book3);
        session.save(book4);
        session.getTransaction().commit();
        System.out.println("Author9B created: " + author3.toString());
        
        // OneToMany - Bidirectional
        
        // Create author4
        Author9C author4 = new Author9C();
        author4.setFirstName("JRR");
        author4.setLastName("Tolkien");
        author4.setAge(81);
        author4.setId(1);
        author4.setDateOfBirth(new Date());
        BookC book5 = new BookC();
        book5.setBookName("The Fellowship of the Ring");
        book5.setId(100);
        book5.setAuthor9C(author4);
        BookC book6 = new BookC();
        book6.setBookName("The Two Towers");
        book6.setId(101);
        book6.setAuthor9C(author4);
        BookC book7 = new BookC();
        book7.setBookName("The Return of the King");
        book7.setId(102);
        book7.setAuthor9C(author4);
        List<BookC> bookCList = Arrays.asList(book5, book6, book7);
        author4.setBookCList(bookCList);
        session.beginTransaction();
        session.save(author4);
        session.save(book5);
        session.save(book6);
        session.save(book7);
        session.getTransaction().commit();
        System.out.println("Author9C created: " + author4.toString());
        
        // OneToMany - Bidirectional - No additional table
        
        // Create author5
        Author9D author5 = new Author9D();
        author5.setFirstName("Stephen");
        author5.setLastName("Hawking");
        author5.setAge(76);
        author5.setId(1);
        author5.setDateOfBirth(new Date());
        BookD book8 = new BookD();
        book8.setBookName("A Brief History of Time");
        book8.setId(100);
        book8.setAuthor9D(author5);
        BookD book9 = new BookD();
        book9.setBookName("The Grand Design");
        book9.setId(101);
        book9.setAuthor9D(author5);
        List<BookD> bookDList = Arrays.asList(book8, book9);
        author5.setBookDList(bookDList);
        session.beginTransaction();
        session.save(author5);
        session.save(book8);
        session.save(book9);
        session.getTransaction().commit();
        System.out.println("Author9D created: " + author5.toString());
        
        // OneToMany - CascadeType.PERSIST
        
        // Create author6
        Author9E author6 = new Author9E();
        author6.setFirstName("William");
        author6.setLastName("Shakespeare");
        author6.setAge(52);
        author6.setId(1);
        author6.setDateOfBirth(new Date());
        BookE book10 = new BookE();
        book10.setBookName("Romeo And Juliet");
        book10.setId(100);
        BookE book11 = new BookE();
        book11.setBookName("Hamlet");
        book11.setId(101);
        List<BookE> bookEList = Arrays.asList(book10, book11);
        author6.setBookEList(bookEList);
        session.beginTransaction();
        session.persist(author6);
        session.getTransaction().commit();
        System.out.println("Author9E created: " + author6.toString());
        
        // ManyToMany
        
        // Create author7
        Author9F author7 = new Author9F();
        author7.setFirstName("Abraham");
        author7.setLastName("Silberschatz");
        author7.setAge(55);
        author7.setId(1);
        author7.setDateOfBirth(new Date());
        
        // Create author8
        Author9F author8 = new Author9F();
        author8.setFirstName("Peter Baer");
        author8.setLastName("Galvin");
        author8.setAge(56);
        author8.setId(2);
        author8.setDateOfBirth(new Date());
        
        // Create author9
        Author9F author9 = new Author9F();
        author9.setFirstName("Greg");
        author9.setLastName("Gagne");
        author9.setAge(54);
        author9.setId(3);
        author9.setDateOfBirth(new Date());
        
        BookF book12 = new BookF();
        book12.setBookName("Operating System Concepts");
        book12.setId(100);
        List<Author9F> author9FList = Arrays.asList(author7, author8, author8);
        book12.setAuthor9FList(author9FList);
        
        BookF book13 = new BookF();
        book13.setBookName("Database System Concepts");
        book13.setId(101);
        book13.author9FList.add(author7);
    
        author7.bookFList.add(book12);
        author7.bookFList.add(book13);
        
        author8.bookFList.add(book12);
        
        author9.bookFList.add(book12);
    
        session.beginTransaction();
        session.save(author7);
        session.save(author8);
        session.save(author9);
        session.save(book12);
        session.save(book13);
        session.getTransaction().commit();
        
        session.close();
        sessionFactory.close();
    }
}
