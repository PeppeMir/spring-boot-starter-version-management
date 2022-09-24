package com.example.service.repository;

import java.util.List;

import com.example.service.model.database.Student;

public interface StudentRepository {

    List<Student> findAll();
}
