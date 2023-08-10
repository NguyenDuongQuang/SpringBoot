package com.example.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class WelcomSpringBoot {
    @GetMapping ("/welcomeSpringBoot")
    public String welcomeSpringBoot(){
        return "welcomeSpringBoot";
    }
}
