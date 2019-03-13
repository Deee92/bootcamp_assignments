package com.spring.intermediate;

import org.springframework.context.event.*;

public class MultiEventListener {
    @EventListener(ContextStartedEvent.class)
    void start() {
        System.out.println("Context started --- ContextStartedEvent");
    }
    
    @EventListener(ContextRefreshedEvent.class)
    void refresh() {
        System.out.println("Context refreshed --- ContextRefreshedEvent");
    }
    
    @EventListener(ContextStoppedEvent.class)
    void stop() {
        System.out.println("Context stopped --- ContextStoppedEvent");
    }
    
    @EventListener(ContextClosedEvent.class)
    void close() {
        System.out.println("Context closed --- ContextClosedEvent");
    }
    
    @EventListener(CustomEvent.class)
    void connectToDatabase() {
        System.out.println("Connecting to database --- com.spring.intermediate.CustomEvent");
    }
}
