package com.ttn.springbootapp.service;

import com.ttn.springbootapp.entity.Student;
import com.ttn.springbootapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    
    public Student createNewStudent(Student s) {
        return studentRepository.save(s);
    }
    
    public Student findById(int id) {
        return studentRepository.findById(id);
    }
    
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    
    public Student updateStudent(int id, Student student) {
        return studentRepository.save(student);
    }
    
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
