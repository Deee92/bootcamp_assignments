/**
 * Question 3:
 * Create a class com.springdemo.Restaurant.
 * Create an interface com.springdemo.HotDrink with an abstract method prepareHotDrink.
 * Create two classes com.springdemo.Tea and com.springdemo.ExpressTea which implements com.springdemo.HotDrink Class.
 * Create an instance variable of type com.springdemo.HotDrink in com.springdemo.Restaurant class.
 * Configure com.springdemo.Tea and com.springdemo.ExpressTea class beans in Spring XML.
 * Create a bean with the name teaRestaurant of type com.springdemo.Restaurant
 * which injects com.springdemo.Tea object as dependency using setter method.
 * <p>
 * Question 4:
 * Get both the beans and invoke prepareHotDrink method via hotDrink
 * instance variables. Try inner bean with expressTeaRestaurant.
 * <p>
 * Question 6:
 * Autowire hotDrink in com.springdemo.Restaurant with tea bean byName, byType and constructor.
 * <p>
 * Question 7:
 * Set the scope of the teaRestaurant bean as prototype and check the scope type after accessing the bean.
 * <p>
 * Question 8:
 * Use @Required annotation for hotDrink setter method in com.springdemo.Restaurant class.
 * <p>
 * Question 9:
 * Use @Autowired annotation to wire com.springdemo.Tea with com.springdemo.Restaurant class Using setter method, field and constructor.
 * <p>
 * Question 10:
 * Use @Component, @Controller, @Repository etc annotation to configure com.springdemo.Tea and com.springdemo.Restaurant in Spring Container.
 */

package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
        System.out.println(restaurant);
        System.out.println("Does teaRestaurantBean have prototype scope? " + context.isPrototype("teaRestaurantBean"));
//        com.springdemo.Restaurant restaurant1 = context.getBean("teaRestaurantBean", com.springdemo.Restaurant.class);
//        System.out.println(restaurant1);
        restaurant.getHotDrink().prepareDrink();
    }
}
