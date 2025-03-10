package com.example.microservices.serviceb.controller;

import com.example.microservices.serviceb.client.ServiceAClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class ServiceBController {

    private final ServiceAClient serviceAClient;

    public ServiceBController(ServiceAClient serviceAClient) {
        this.serviceAClient = serviceAClient;
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from Service B!";
    }

    @GetMapping("/combined-message")
    public String getCombinedMessage() {
        String serviceAMessage = serviceAClient.getMessageFromServiceA();
        return "Service B received: " + serviceAMessage;
    }
}