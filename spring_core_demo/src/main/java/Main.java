/**
 * Questions 1, 2:
 *
 * Create a class Database with 2 instance variables port and name.
 * Configure Database class bean in spring container through Spring XML.
 * Initialize instance variables using setter method.
 *
 * Get the bean of the class from spring container
 * and print the values of the instance variable.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Database database = context.getBean("databaseBean", Database.class);
        System.out.println("Database bean: " + database);
        System.out.println("Database name: " + database.getName());
        System.out.println("Database port: " + database.getPort());
    }
}
