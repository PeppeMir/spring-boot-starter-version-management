package com.example.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.model.dto.StudentDto;
import com.example.service.service.StudentService;

@RestController
@RequestMapping("/api/v1.0/students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentDto> getAll() {
        return studentService.getAll();
    }
}
