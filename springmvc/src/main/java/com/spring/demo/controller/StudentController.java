/**
 * Use MultiActionController for StudentController which contains 2 actions
 * One action renders a jsp view and another action uses HttpServletResponse to show the output on the Web browser
 * Use annotation in StudentController to define a default action index which renders a jsp page.
 * Create one more annotation based action hello inside the StudentController which uses @ResponseBody annotation to display Hello world
 * Create one more action which sends Model HelloWorld to the jsp file
 * Use @PathVariable annotation to access firstname and lastname in an action inside StudentController place both the parameters in different arguments and access them
 * Now place both the arguments inside a Map and access the Map instead
 * Use @RequestParam annotation to access the firstname and lastname in formData action of StudentController
 * Create a StudentCO and bind firstname and lastname with instance variable of StudentCO.
 * Use @ModelAttribute annotation to add Heading "Spring MVC Demo" in every model.
 */

package com.spring.demo.controller;

import com.spring.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RequestMapping("/students")
@Controller
public class StudentController extends MultiActionController {
    @ModelAttribute
    void addingObject(Model model) {
        model.addAttribute("heading", "Spring MVC Demo");
    }
    
    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("message", "Index from StudentController");
        return modelAndView;
    }
    
    @RequestMapping("/action-1")
    public ModelAndView actionOne() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("action-one");
        modelAndView.addObject("message", "Action 1 from StudentController!");
        return modelAndView;
    }
    
    @RequestMapping("/action-2")
    public void actionTwo(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<h1>Action 2 from StudentController!</h1>");
    }
    
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, world!";
    }
    
    @RequestMapping("/hello-world")
    public ModelAndView sayHelloWorld() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello-world");
        modelAndView.addObject("greeting", "Hello, world!");
        return modelAndView;
    }
    
    @RequestMapping("/{firstName}/{lastName}")
    @ResponseBody
    public String accessPathVariablesIndependently(
            @PathVariable("firstName") String firstName,
            @PathVariable("lastName") String lastName) {
        return "Hello, " + firstName + " " + lastName;
    }
    
    @RequestMapping("/{firstName}/{middleName}/{lastName}")
    @ResponseBody
    public String accessPathVariablesFromMap(@PathVariable Map<String, String> requestMap) {
        return "Hello, " +
                requestMap.get("firstName") + " " +
                requestMap.get("middleName") + " " +
                requestMap.get("lastName");
    }
    
    @RequestMapping("/add")
    public ModelAndView addStudentForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new-student");
        return modelAndView;
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addStudent(
            @RequestParam("firstname") String firstName,
            @RequestParam("lastname") String lastName) {
        return "New student details: " +
                "First name: " + firstName + ", " +
                "Last name: " + lastName;
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView saveStudent(@ModelAttribute("student") Student student) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome-student");
        modelAndView.addObject(student);
        return modelAndView;
    }
}
