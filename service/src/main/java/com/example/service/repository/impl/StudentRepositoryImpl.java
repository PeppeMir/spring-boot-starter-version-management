package com.example.service.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.service.model.database.Student;
import com.example.service.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * FROM Student", new MapSqlParameterSource(),
                new BeanPropertyRowMapper<>(Student.class));
    }

}
