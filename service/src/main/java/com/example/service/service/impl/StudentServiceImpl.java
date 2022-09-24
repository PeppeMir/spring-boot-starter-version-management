package com.example.service.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.service.converter.StudentConverter;
import com.example.service.model.dto.StudentDto;
import com.example.service.repository.StudentRepository;
import com.example.service.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentConverter studentConverter;

    @Override
    public List<StudentDto> getAll() {
        return studentRepository.findAll().stream()
                .map(studentConverter::toDto)
                .collect(Collectors.toList());
    }

}
