package com.ttn.thymeleaf.service;

import com.ttn.thymeleaf.entity.Employee;
import com.ttn.thymeleaf.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    
    public Employee getEmployeeById(Integer id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        return optional.isPresent() ? optional.get() : null;
    }
    
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
