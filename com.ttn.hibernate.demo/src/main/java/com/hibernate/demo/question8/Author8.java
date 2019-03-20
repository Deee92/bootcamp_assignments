package com.hibernate.demo.question8;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Author8 {
    @Id
    int id;
    String firstName;
    String lastName;
    int age;
    Date dateOfBirth;
    @ElementCollection
    List<String> listOfSubjects = new ArrayList<>();
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public List<String> getListOfSubjects() {
        return listOfSubjects;
    }
    
    public void setListOfSubjects(List<String> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }
    
    @Override
    public String toString() {
        return "Author8{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", listOfSubjects=" + listOfSubjects +
                '}';
    }
}
