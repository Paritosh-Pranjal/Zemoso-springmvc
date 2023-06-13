package com.zemoso.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    private static final String HELLO_WORLD_VIEW = "helloworld";

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processsForm() {
        return HELLO_WORLD_VIEW;
    }

    @RequestMapping("/processFormVersionTwo")
    public String letShoutDude(HttpServletRequest request, Model model) {
        // read the request parameters from the HTML form
        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "Yo!" + theName;

        model.addAttribute("message", result);

        return HELLO_WORLD_VIEW;
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
            @RequestParam("studentName") String theName,
            Model model) {

        theName = theName.toUpperCase();

        String result = "Hey My friend from v3!" + theName;

        model.addAttribute("message", result);

        return HELLO_WORLD_VIEW;
    }
}
