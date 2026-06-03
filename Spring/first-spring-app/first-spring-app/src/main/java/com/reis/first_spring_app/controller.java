package com.reis.first_spring_app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
class HelloController {
    @GetMapping("/")
    public String hello(){
        return "Hello World, I'm Rodrigo. This's my first application Spring Boot. Is easy, but I'm learning.";
    }
}
