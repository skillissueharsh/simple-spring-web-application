package com.ojha.simpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRequest {

    @RequestMapping("/Login")
    public String login(){
        return "Login page...";
    }
}
