package com.ttn.springbootapp.repository;

import com.ttn.springbootapp.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    Student findById(int id);
    
    List<Student> findAll();
    
    Student save(Student s);
    
    void deleteById(int id);
}
