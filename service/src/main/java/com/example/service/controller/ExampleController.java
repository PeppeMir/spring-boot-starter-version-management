package com.example.service.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.model.request.EchoRequest;

@RestController
@RequestMapping("/api/v1.0/examples")
public class ExampleController {

    // This property come from the starter project, which performs component
    // scanning its own
    @Value("${example.prop1}")
    private String prop1;

    @GetMapping
    public String echo(@Valid final EchoRequest request) {
        return request.getValue() + ": " + prop1;
    }

}
