/**
 * Question 5:
 * Create a class Complex with a list, a set, and a map as instance variables.
 * Initialize all the instance variables of the Complex class using Spring XML.
 * Give bean name as complexBean.
 * Get the bean and display the properties.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Complex complex = context.getBean("complexBean", Complex.class);
        System.out.println("Getting list:");
        complex.getComplexList().forEach(integer -> System.out.println(integer));
        System.out.println("Getting set:");
        complex.getComplexSet().forEach(integer -> System.out.println(integer));
        System.out.println("Getting map:");
        complex.getComplexMap().entrySet().forEach(characterIntegerEntry -> System.out.println(characterIntegerEntry));
    }
}
