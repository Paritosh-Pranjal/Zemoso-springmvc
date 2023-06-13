package com.zemoso.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
@RequestMapping("/student")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // create a student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        // log the input data
        logger.info("theStudent: {} {}", theStudent.getFirstName(), theStudent.getLastName());

        return "student-confirmation";
    }
}


