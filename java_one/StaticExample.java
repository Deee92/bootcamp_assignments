/**
 * Question 7: Program to print your first name, last name, and age using static block, static method,
 * and static variables
 */

public class StaticExample {
    static String firstName;
    static String lastName;
    static int age;
    
    static {
        System.out.println("Static block");
        firstName = "John";
        lastName = "Doe";
        age = 43;
    }
    
    static void getMyDetails() {
        System.out.println("Hi, I am " + firstName + " " + lastName + ". I am " + age + " years old.");
    }
    
    public static void main(String[] args) {
        new StaticExample();
        StaticExample.getMyDetails();
    }
}
