package com.example.learning;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController {
    @Get("/hello")
    public String getGreetingString(){
        return "Hello World";
    }
}

