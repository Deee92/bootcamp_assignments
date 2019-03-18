/**
 * Implement AbstractController in StudentController
 * Create a mapping index.html for it
 * Render index.jsp view from it which displays messages "Hello from index.jsp"
 */

package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class StudentAbstractController extends AbstractController {
    
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("abstract-index");
        modelAndView.addObject("message", "Hello from abstract-index.jsp!");
        return modelAndView;
    }
}
