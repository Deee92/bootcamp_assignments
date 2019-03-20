package com.hibernate.demo.question9;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookC {
    @Id
    int id;
    String bookName;
    @ManyToOne
    Author9C author9C;
    
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
    
    public Author9C getAuthor9C() {
        return author9C;
    }
    
    public void setAuthor9C(Author9C author9C) {
        this.author9C = author9C;
    }
    
    @Override
    public String toString() {
        return "BookC{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
