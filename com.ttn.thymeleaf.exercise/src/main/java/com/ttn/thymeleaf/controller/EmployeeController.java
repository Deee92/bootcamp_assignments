package com.ttn.thymeleaf.controller;

import com.ttn.thymeleaf.entity.Employee;
import com.ttn.thymeleaf.entity.Person;
import com.ttn.thymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    
    @GetMapping("hello")
    ModelAndView sayHello() {
        return new ModelAndView("hello");
    }
    
    // Get one employee
    @GetMapping("employees/{id}")
    ModelAndView getUser(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("dashboard");
        Employee employee = employeeService.getEmployeeById(id);
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }
    
    // Get all employees
    @GetMapping("employees")
    ModelAndView listOfUsers() {
        ModelAndView modelAndView = new ModelAndView("employees");
        List<Employee> employeeList = employeeService.getAllEmployees();
        modelAndView.addObject("employeeList", employeeList);
        return modelAndView;
    }
    
    // Register new employee
    @GetMapping("register")
    ModelAndView userForm() {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }
    
    // Save new employee
    @PostMapping("employees")
    ModelAndView addUser(@ModelAttribute("employee") Employee employee) {
        ModelAndView modelAndView = new ModelAndView("dashboard");
        employeeService.saveEmployee(employee);
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }
    
    // Greet user based on type
    @GetMapping("greet")
    ModelAndView greetUser() {
        ModelAndView modelAndView = new ModelAndView("greet");
        boolean admin = false;
        modelAndView.addObject("admin", admin);
        return modelAndView;
    }
    
    // Get server time
    @GetMapping("time")
    ModelAndView getTimePage() {
        return new ModelAndView("time");
    }
    
    @GetMapping("getTime")
    @ResponseBody
    String tellTheTime() {
        Date date = new Date();
        return date.toString();
    }
    
    // User table
    @GetMapping("users")
    ModelAndView getUserTable() {
        return new ModelAndView("user-table");
    }
    
    // User types
    @GetMapping("/userTypes")
    public ModelAndView getEnumMessage() {
        return new ModelAndView("user-types");
    }
    
    @GetMapping("/userTypes/{type}")
    @ResponseBody
    public String getEnumMessageResult(@PathVariable("type") String type) {
        return ("Hello " + type);
    }
    
    @GetMapping("/userForm")
    public ModelAndView getLoader() {
        return new ModelAndView("user-form");
    }
    
    @PostMapping("/userForm")
    @ResponseBody
    public String showLoader(@ModelAttribute("person") Person person) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(person.getUserName());
        return "User " + person.getUserName() + " logged in successfully";
    }
}
