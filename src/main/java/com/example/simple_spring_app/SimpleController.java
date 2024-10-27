package com.example.simple_spring_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SimpleController {

    @GetMapping("/get")
    public String getData() {
        return "Hello, dear";
    }
}
