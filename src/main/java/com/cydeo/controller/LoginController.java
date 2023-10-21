package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class LoginController {

    @GetMapping(value = {"/login", "/"})  //localhost:8080/ or localhost:8080/login
    public String login() {
        return "login";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

}