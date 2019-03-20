package com.hibernate.demo.question9;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookD {
    @Id
    int id;
    String bookName;
    @ManyToOne
    Author9D author9D;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public Author9D getAuthor9D() {
        return author9D;
    }
    
    public void setAuthor9D(Author9D author9D) {
        this.author9D = author9D;
    }
    
    @Override
    public String toString() {
        return "BookC{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
