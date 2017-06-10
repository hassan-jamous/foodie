package com.foodie.au.web.controller;

import com.foodie.au.aspects.Loggable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Loggable
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
