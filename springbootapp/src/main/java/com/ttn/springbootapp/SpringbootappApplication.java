/**
 * Create a Restful API using Spring Boot for Student
 * Run Spring Boot Application with all the three ways
 * Create Bean User containing two field username and password with Spring Context File
 * Create a Bean Database with two fields port and name and access its values using application.properties
 * Configure environment-specific values from Database Bean
 * Apply Logging wherever you feel is necessary
 * Bootstrap Data for Student Domain
 * *******
 * To run:
 * SpringBootApplication.main()
 * gradle bootRun
 * java -jar build/libs/<jar-name>.jar
 */

package com.ttn.springbootapp;

import com.ttn.springbootapp.entity.Database;
import com.ttn.springbootapp.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;

@SpringBootApplication
public class SpringbootappApplication {
    @Bean
    public User user() {
        User user = new User();
        return user;
    }
    
    @Value("${database.name}")
    String dbName;
    
    @Value("${database.port}")
    Integer dbPort;
    
    @Bean
    public Database database() {
        Database database = new Database();
        database.setName(dbName);
        database.setPort(dbPort);
        System.out.println(database.toString());
        return database;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, Spring Boot!");
        SpringApplication.run(SpringbootappApplication.class, args);
    }
}
