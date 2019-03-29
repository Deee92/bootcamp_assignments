package com.spring.rest.events;

import com.spring.rest.entities.Student;
import com.spring.rest.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class Bootstrap {
    
    @Autowired
    StudentRepository studentRepository;
    
    @EventListener(ContextRefreshedEvent.class)
    void setUp() {
        if (!studentRepository.findAll().iterator().hasNext()) {
            IntStream.range(0, 10).forEach(e -> {
                Student student = new Student();
                student.setFirstName("Stu");
                student.setLastName("Dent" + e);
                studentRepository.save(student);
            });
        }
    }
    
}
