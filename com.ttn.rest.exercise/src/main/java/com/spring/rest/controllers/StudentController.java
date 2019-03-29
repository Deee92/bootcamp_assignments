package com.spring.rest.controllers;

import com.spring.rest.entities.Student;
import com.spring.rest.entities.StudentV1;
import com.spring.rest.entities.StudentV2;
import com.spring.rest.exceptions.StudentNotFoundException;
import com.spring.rest.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    
    @Autowired
    MessageSource messageSource;
    
    @GetMapping("/")
    String welcomeStudent(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        System.out.println("Selected language: " + locale.getLanguage());
        return messageSource.getMessage("welcome.message", null, locale);
    }
    
    @GetMapping("/students")
    List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    
    @GetMapping("/students/{id}")
    Student getOneStudent(@PathVariable Integer id) {
        Optional<Student> studentOptional = studentService.getOneStudent(id);
        if (studentOptional.isPresent())
            return studentOptional.get();
        else throw new StudentNotFoundException("No student with id " + id);
    }
    
    @PostMapping("/students")
    ResponseEntity<Student> createNewStudent(@RequestBody @Valid Student student) {
        studentService.saveStudent(student);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}").buildAndExpand(student.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    
    @PutMapping("/students/{id}")
    Student updateStudent(@PathVariable Integer id, @RequestBody @Valid Student student) {
        Optional<Student> studentOptional = studentService.getOneStudent(id);
        if (studentOptional.isPresent()) {
            return studentService.saveStudent(student);
        } else {
            throw new StudentNotFoundException("No student with id " + id);
        }
    }
    
    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable Integer id) {
        Optional<Student> optionalStudent = studentService.getOneStudent(id);
        if (optionalStudent.isPresent())
            studentService.deleteStudent(optionalStudent.get());
        else throw new StudentNotFoundException("No student with id " + id);
    }
    
    // URI versioning
    
    @GetMapping("/students/V1")
    List<StudentV1> getStudentV1URI() {
        StudentV1 student1 = new StudentV1("First", "StudentV1");
        StudentV1 student2 = new StudentV1("Second", "StudentV1");
        StudentV1 student3 = new StudentV1("Third", "StudentV1");
        return Arrays.asList(student1, student2, student3);
    }
    
    @GetMapping("/students/V2")
    List<StudentV2> getStudentV2URI() {
        StudentV2 student1 = new StudentV2("First StudentV2");
        StudentV2 student2 = new StudentV2("Second StudentV2");
        StudentV2 student3 = new StudentV2("Third StudentV2");
        return Arrays.asList(student1, student2, student3);
    }
    
    // Parameter Versioning
    
    // /students/param?version=1
    @GetMapping(value = "/students/param", params = "version=1")
    List<StudentV1> getStudentV1Param() {
        StudentV1 student1 = new StudentV1("First", "StudentV1");
        StudentV1 student2 = new StudentV1("Second", "StudentV1");
        StudentV1 student3 = new StudentV1("Third", "StudentV1");
        return Arrays.asList(student1, student2, student3);
    }
    
    // /students/param?version=2
    @GetMapping(value = "/students/param", params = "version=2")
    List<StudentV2> getStudentV2Param() {
        StudentV2 student1 = new StudentV2("First StudentV2");
        StudentV2 student2 = new StudentV2("Second StudentV2");
        StudentV2 student3 = new StudentV2("Third StudentV2");
        return Arrays.asList(student1, student2, student3);
    }
    
    //Header Versioning
    
    // API-VERSION 1 header with request
    @GetMapping(value = "/students/header", headers = "API-VERSION=1")
    List<StudentV1> getStudentV1Header() {
        StudentV1 student1 = new StudentV1("First", "StudentV1");
        StudentV1 student2 = new StudentV1("Second", "StudentV1");
        StudentV1 student3 = new StudentV1("Third", "StudentV1");
        return Arrays.asList(student1, student2, student3);
    }
    
    // API-VERSION 2 header with request
    @GetMapping(value = "/students/header", headers = "API-VERSION=2")
    List<StudentV2> getStudentV2Header() {
        StudentV2 student1 = new StudentV2("First StudentV2");
        StudentV2 student2 = new StudentV2("Second StudentV2");
        StudentV2 student3 = new StudentV2("Third StudentV2");
        return Arrays.asList(student1, student2, student3);
    }
}
