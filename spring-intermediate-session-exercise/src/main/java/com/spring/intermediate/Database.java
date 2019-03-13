package com.spring.intermediate;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.io.IOException;

public class Database implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;
    
    int port;
    String name;
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPort() {
        return port;
    }
    
    void connect() {
        CustomEvent customEvent = new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("Connecting to " + this.getName() + " on port " + this.getPort());
    }
    
    void willThrowException() {
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    void someDatabaseMethod(int someInt) {
        System.out.println("This method takes an int");
    }
    
    int someIntMethod(int someInt) {
        System.out.println("This method takes an int and returns an int");
        return 1;
    }
    
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
