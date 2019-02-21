/**
 * Question 1: Create Java classes having suitable attributes for
 * Library management system. Use OOP concepts in your design.
 * Also try to use interfaces and abstract classes.
 */

import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.setLibraryLocation("Rajiv Chowk");
        Book b1 = new Book("Head First Java", "Eric S", 700.0f);
        Book b3 = new Book("Head First Design Patterns", "Donald Y", 900.0f);
        Book b2 = new Book("Head First HTML5 Programming", "David P", 800.0f);
        Book b4 = new Book("Head First HTML & CSS", "Henry T", 600.0f);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        myLibrary.setBooksInLibrary(bookList);
        Librarian librarian = new Librarian("Kanchan Sinha", 3284);
        myLibrary.setLibrarian(librarian);
        Member m1 = new Member("Divya Arora", 3338);
        Member m2 = new Member("Manju Arora", 3339);
        Member m3 = new Member("Himani Sharma", 3340);
        ArrayList<Member> memberList = new ArrayList<>();
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
        myLibrary.setMembersOfLibrary(memberList);
        myLibrary.getLibraryDetails();
    }
}

