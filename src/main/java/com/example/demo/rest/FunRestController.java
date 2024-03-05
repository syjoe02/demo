package com.example.demo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FunRestController {

    // expose "/" that return "hello"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
