/**
 * Question 1:
 * Create an external JS file and use it to show an alert on click of a button
 * Question 2:
 * Create an external CSS file and use it to modify hello world page background color to grey
 * Question 3:
 * Create an Employee registration form and bind its requested values on the controller
 * Question 4:
 * Create a dynamic HTML page and render an Employee table with emp object returned from the controller
 * Question 5:
 * Show different custom greeting message based on the type of user.
 * For example, if the user is of type admin=true then show "Hello Admin" message on Page else show "Hello User"
 * based on isAdmin attribute value passed in model data
 * Question 6:
 * Create and split common header and footer in the above-created listing page
 * Question 7:
 * Make a web page to show server time using ajax call
 * Question 8:
 * Create a user listing table show alternate row color using a conditional tag
 * Question 9:mjajf
 * Create an ENUM with values USER, ADMIN, SUPER_ADMIN and iterate it to show a custom message to users based on the ENUM value
 * Question 10:
 * Add loader in registration form submission which renders load till server return success form submission response
 */

package com.ttn.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}
