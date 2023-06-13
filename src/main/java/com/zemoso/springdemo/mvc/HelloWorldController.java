package com.zemoso.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//we can add a realtive requestmapper so that we can use RequestMapping("/showform) anywhere without ambiguity
@RequestMapping("/hello")
public class HelloWorldController {

    //    need a controller method to show the initial HTML form
//    @RequestMapping("/")
//    public String MainPage()
//    {
//        return "main-menu";
//    }

    // this will now hello/showForm insetad of /showForm
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processsForm() {
        return "helloworld";
    }


    // need a controller method to read form data and
    // add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letShoutDude(HttpServletRequest request, Model model) {
        // read the request parameters from the html form
        String theName = request.getParameter("studentName");
        // convert hte data to all caps
        theName = theName.toUpperCase();


        // create the message
        String result = "Yo!" + theName;

        // add the message to model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
            @RequestParam("studentName") String theName,
            Model model) {
        // convert hte data to all caps
        theName = theName.toUpperCase();


        // create the message
        String result = "Hey My friend from v3!" + theName;

        // add the message to model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
