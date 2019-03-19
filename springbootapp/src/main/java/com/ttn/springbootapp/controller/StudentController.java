package com.ttn.springbootapp.controller;

import com.ttn.springbootapp.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.ttn.springbootapp.entity.Student;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

//    @Value("{app.name}")
//    static String appName;
    
    Logger logger = LoggerFactory.getLogger(StudentController.class);
    
    @GetMapping("/hello")
    public String sayHello() {
        logger.trace("=== Spring Boot application says hello ===");
        // System.out.println(appName);
        return "Hello";
    }
    
    // Get one student
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        logger.info("=== Getting a student with id " + id + " ===");
        return studentService.findById(id);
    }
    
    // Get all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        logger.info("=== Getting all students ===");
        return studentService.findAll();
    }
    
    // Create a new student
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        logger.debug("=== Creating a new student " + student.toString() + " ===");
        return studentService.createNewStudent(student);
    }
    
    // Edit a student
    @PutMapping("/students/{id}")
    public Student editStudent(@PathVariable("id") int id, @RequestBody Student student) {
        logger.debug("=== Updating student with id " + id + " ===");
        return studentService.updateStudent(id, student);
    }
    
    // Delete a student
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        logger.warn("=== Deleting student with id " + id + " ===");
        studentService.deleteStudent(id);
    }
}
