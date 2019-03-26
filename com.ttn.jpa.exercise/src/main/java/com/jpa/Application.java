/**
 * Question 1:
 * Create a Person entity with instance variables firstName, lastName, salary, age, and id
 * Question 2:
 * Implement CrudRepository for it
 * Question 3:
 * Perform all the methods inside CrudRepository for Person Class
 * Question 4:
 * For class Person, declare methods in repository to find person by firstName, lastName, and id
 * Use the methods declared above to fetch the person
 * Question 5:
 * Use @Query to fetch firstName of the Person whose age is 25
 * Question 6:
 * Use @Query to fetch firstName and lastName of the Person whose age is 25
 * Question 7:
 * Get complete information of the Employee whose age is 25 using @Query
 * Question 8:
 * Count Person where name is "Peter" using @Query
 * Question 9:
 * Implement following methods for Person repository:
 * count
 * distinct
 * or
 * and
 * between
 * LessThan
 * GreaterThan
 * Like
 * Not
 * In
 * IgnoreCase
 * Question 10:
 * Get the persons greater than age 25 and sort them in descending order according to id by method query
 * Question 11:
 * Do  the question above using the Sort class
 * Question 12:
 * Apply Pagination on Person entities.
 */

package com.jpa;

import com.jpa.configuration.PersistenceContext;
import com.jpa.entities.Person;
import com.jpa.repositories.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceContext.class);
        PersonRepository personRepository = context.getBean(PersonRepository.class);
        // QUESTION 1
        Person person = new Person();
        person.setId(1);
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setSalary(40000);
        person.setAge(43);
        
        // Create
        personRepository.save(person);
        System.out.println("=== Person saved: ===");
        System.out.println(person);
        
        // Read
        System.out.println("=== Persons read: ===");
        System.out.println(personRepository.findAll());
        
        // Update
        Person personToUpdate = personRepository.findOne(1);
        personToUpdate.setFirstName("Jane");
        personRepository.save(personToUpdate);
        System.out.println("=== Person updated: ===");
        System.out.println(personToUpdate);
        
        // Delete
        Person personToDelete = personRepository.findOne(1);
        personRepository.delete(personToDelete);
        System.out.println("=== Person deleted: ===");
        System.out.println(personToDelete);
        
        Person person1 = new Person();
        person1.setId(2);
        person1.setFirstName("Peter");
        person1.setLastName("Parker");
        person1.setSalary(50000);
        person1.setAge(25);
        
        Person person2 = new Person();
        person2.setId(3);
        person2.setFirstName("Peter");
        person2.setLastName("Man");
        person2.setSalary(30000);
        person2.setAge(27);
        
        Person person3 = new Person();
        person3.setId(4);
        person3.setFirstName("Bruce");
        person3.setLastName("Wayne");
        person3.setSalary(40000);
        person3.setAge(36);
        
        Person person4 = new Person();
        person4.setId(5);
        person4.setAge(45);
        person4.setFirstName("Stephen");
        person4.setLastName("Strange");
        person4.setSalary(60000);
        
        Person person5 = new Person();
        person5.setId(6);
        person5.setAge(47);
        person5.setFirstName("Clark");
        person5.setLastName("Kent");
        person5.setSalary(50000);
        
        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);
        personRepository.save(personList);
        
        // QUESTION 4
        System.out.println("=== Person with ID 2: ===");
        System.out.println(personRepository.findById(2));
        
        System.out.println("=== Person with first name Peter: ===");
        System.out.println(personRepository.findByFirstName("Peter"));
        
        System.out.println("=== Person with last name Parker: ===");
        System.out.println(personRepository.findByLastName("Parker"));
        
        // QUESTION 5
        System.out.println("=== First name of person whose age is 25: ===");
        System.out.println(personRepository.findFirstNameByAge(25));
        
        // QUESTION 6
        System.out.println("=== First and last names of person whose age is 25: ===");
        List<Object[]> fullName = personRepository.findFullNameByAge(25);
        for (Object[] nameArray : fullName) {
            for (Object name : nameArray) {
                System.out.println(name);
            }
        }
        
        // QUESTION 7
        System.out.println("=== Person details from age: ===");
        System.out.println(personRepository.findPersonByAge(25));
        
        // QUESTION 8
        System.out.println("=== Count of persons with first name Peter: ===");
        System.out.println(personRepository.countPeopleByFirstName("Peter"));
        
        // QUESTION 9
        System.out.println("=== Count of all persons: ===");
        System.out.println(personRepository.count());
        
        System.out.println("=== Persons with age 25 or last name Wayne: ===");
        System.out.println(personRepository.findByAgeOrLastName(25, "Wayne"));
        
        System.out.println("=== Persons with age 36 and first name Bruce: ===");
        System.out.println(personRepository.findByAgeAndFirstName(36, "Bruce"));
        
        System.out.println("=== Persons with salary between 30000 and 40000: ===");
        System.out.println(personRepository.findBySalaryBetween(40000, 50000));
        
        System.out.println("=== Persons with age less than 30: ===");
        System.out.println(personRepository.findByAgeLessThan(30));
        
        System.out.println("=== Persons with age greater than 30: ===");
        System.out.println(personRepository.findByAgeGreaterThan(30));
        
        System.out.println("=== Persons with first name like 'Bru%': ===");
        System.out.println(personRepository.findByFirstNameLike("Bru%"));
        
        System.out.println("=== Persons with first name not Peter: ===");
        System.out.println(personRepository.findByFirstNameNot("Peter"));
        
        System.out.println("=== Persons with age in [27, 36]: ===");
        System.out.println(personRepository.findByAgeIn(Arrays.asList(27, 36)));
        
        System.out.println("=== Persons with last name WAYNE: ===");
        System.out.println(personRepository.findByLastNameIgnoreCase("WAYNE"));
        
        // QUESTION 10
        System.out.println("=== Persons with age greater than 25 in descending order of ID: ===");
        System.out.println(personRepository.findByAgeGreaterThanOrderByIdDesc(25));
        
        // QUESTION 11
        System.out.println("=== Persons with age greater than 25 in descending order of ID using Sort: ===");
        System.out.println(personRepository.findByAgeGreaterThan(25, new Sort(Sort.Direction.DESC, "id")));
        
        // QUESTION 12
        System.out.println("=== Persons, paginated: ===");
        Page<Person> personPage = personRepository.findAll(new PageRequest(0, 3, new Sort(Sort.Direction.DESC, "id")));
        List<Person> listOfPersons = personPage.getContent();
        System.out.println(listOfPersons);
    }
}
