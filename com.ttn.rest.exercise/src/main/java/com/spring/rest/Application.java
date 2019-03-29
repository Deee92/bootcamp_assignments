/**
 * Question 1:
 * Create a Rest API for Student using noun plurals for endpoints
 * and http verbs for different operations
 * Question 2:
 * Create a Customised Exception Handler
 * Question 3:
 * Print the Validation Messages of student Entity in response
 * Question 4:
 * Perform Internationalization for a greeting message in your app
 * Question 5:
 * Return XML Response when new Student is created
 * Question 6;
 * Ignore ID field in the Response
 * Question 7:
 * Create 2 versions of your API one take represent name of the Student
 * as single string and other showing firstName and lastName separately
 * (Create the Versions of the API using URI, parameter, and header versioning)
 * Question 8:
 * Perform CRUD operations on the resource below using RestTemplate
 * https://jsonplaceholder.typicode.com/posts
 */

package com.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.spring.rest.repositories")
@EntityScan(basePackages = {"com.spring.rest.entities"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

