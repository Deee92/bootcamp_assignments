package com.spring.rest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudentV2 {
    @Id
    @GeneratedValue
    private Integer id;
    private String fullName;
    
    public StudentV2(String fullName) {
        this.fullName = fullName;
    }
    
    public Integer getId() {
        return id;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    @Override
    public String toString() {
        return "StudentV2{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
