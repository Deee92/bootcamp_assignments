/**
 * Question 1: Invoke context events start(), stop() and close()
 * <p>
 * Question 2: Create listeners for spring events
 * <p>
 * Question 3: Create a com.spring.intermediate.CustomEvent which should get published when
 * you invoke connect method of database bean
 * <p>
 * Question 4: Create a logging aspect. Create a pointcut to log all methods of services
 * <p>
 * Question 5: Add a logging statement before and after the method ends
 * <p>
 * Question 6: Log all the methods which throw IOException
 * <p>
 * Question 7: Apply execution, within, args, this, and bean expressions
 * on the before and after advice of service bean
 * <p>
 * Question 8: Demonstrate the use of pointCut @Pointcut annotation
 * and Reuse the expression created
 * <p>
 * Question 9: Access the properties of the JoinPoint in before advice
 * Print Signature of method being called and its arguments
 */

package com.spring.intermediate;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.start();
        Database database = context.getBean("databaseBean", Database.class);
        System.out.println("Database name: " + database.getName());
        System.out.println("Database port: " + database.getPort());
        database.connect();
        database.willThrowException();
        database.someDatabaseMethod(6);
        database.someIntMethod(6);
        ServiceClass serviceClass = context.getBean("serviceClassBean", ServiceClass.class);
        serviceClass.doSomething();
        serviceClass.doSomethingElse();
        context.stop();
        context.close();
    }
}
