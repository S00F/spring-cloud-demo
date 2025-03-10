package com.example.microservices.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from Service A!";
    }
}