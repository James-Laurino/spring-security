package com.fotova.springlearnsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController
{
    @GetMapping(path = "/hello")
    public String greeting()
    {
        return "Hello world";
    }
}
