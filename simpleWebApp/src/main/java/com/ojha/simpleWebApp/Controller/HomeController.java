package com.ojha.simpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        System.out.println("i am gere ");
        return "Welcome";
    }

    @RequestMapping("/about")
    public String about(){
        return "chal na";
    }
}
