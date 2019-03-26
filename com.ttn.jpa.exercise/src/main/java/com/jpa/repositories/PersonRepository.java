package com.jpa.repositories;

import com.jpa.entities.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    List<Person> findByFirstName(String firstName);
    
    List<Person> findByLastName(String lastName);
    
    List<Person> findById(Integer id);
    
    @Query("SELECT firstName from Person where age = :age")
    String findFirstNameByAge(@Param("age") Integer age);
    
    @Query("SELECT firstName, lastName from Person where age = :age")
    List<Object[]> findFullNameByAge(@Param("age") Integer age);
    
    @Query("SELECT p from Person p where age = :age")
    Person findPersonByAge(@Param("age") Integer age);
    
    @Query("SELECT count(*) from Person where firstName = :firstName")
    Integer countPeopleByFirstName(@Param("firstName") String firstName);
    
    List<Person> findByAgeOrLastName(Integer age, String lastName);
    
    List<Person> findByAgeAndFirstName(Integer age, String firstName);
    
    List<Person> findBySalaryBetween(int minSalary, int maxSalary);
    
    List<Person> findByAgeLessThan(Integer age);
    
    List<Person> findByAgeGreaterThan(Integer age);
    
    List<Person> findByFirstNameLike(String firstName);
    
    List<Person> findByFirstNameNot(String firstName);
    
    List<Person> findByAgeIn(List<Integer> ageList);
    
    List<Person> findByLastNameIgnoreCase(String lastName);
    
    List<Person> findByAgeGreaterThanOrderByIdDesc(Integer age);
    
    List<Person> findByAgeGreaterThan(Integer age, Sort sort);
    
    Page<Person> findAll(Pageable pageable);
}
