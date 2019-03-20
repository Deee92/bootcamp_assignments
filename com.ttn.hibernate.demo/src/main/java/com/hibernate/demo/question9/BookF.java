package com.hibernate.demo.question9;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookF {
    @Id
    int id;
    String bookName;
    @ManyToMany(mappedBy = "bookFList")
    List<Author9F> author9FList = new ArrayList<>();
    
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
    
    public List<Author9F> getAuthor9FList() {
        return author9FList;
    }
    
    public void setAuthor9FList(List<Author9F> author9FList) {
        this.author9FList = author9FList;
    }
    
    @Override
    public String toString() {
        return "BookF{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
