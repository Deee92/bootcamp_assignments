package com.ttn.thymeleaf.entity;

public enum User {
    USER("User"), ADMIN("Admin"), SUPER_ADMIN("Super admin");
    String value;
    
    User(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}
