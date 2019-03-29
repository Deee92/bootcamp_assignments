package com.ttn.thymeleaf.repository;

import com.ttn.thymeleaf.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findAll();
}
