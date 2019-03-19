package com.ttn.springbootapp.controller;

import com.ttn.springbootapp.entity.Student;
import com.ttn.springbootapp.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap {
    
    Logger logger = LoggerFactory.getLogger(Bootstrap.class);
    
    @Autowired
    StudentRepository studentRepository;
    
    @EventListener(ApplicationStartedEvent.class)
    public void init() {
        logger.info("=== Loading initial student data ===");
        if (studentRepository.count() == 0) {
            Student student = new Student();
            student.setId(1);
            student.setName("Harry");
            student.setHouse("Gryffindor");
            studentRepository.save(student);
        }
    }
}
