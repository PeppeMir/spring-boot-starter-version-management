package com.example.service.converter;

import org.mapstruct.Mapper;

import com.example.service.model.database.Student;
import com.example.service.model.dto.StudentDto;

@Mapper(componentModel = "spring")
public interface StudentConverter {

    StudentDto toDto(Student db);
    
}
