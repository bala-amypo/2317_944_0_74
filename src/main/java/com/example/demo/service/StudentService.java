package com.example.demo.service;

import java.util.Optional;
import java.util.List;

import com.example.demo.entity.StudentEntity;

public interface StudentService {
    StudentEntity insertStudent(StudentEntity entity);
    List<StudentEntity> getAllStudents();
    Optional<StudentEntity> getOneStudent(Long id);
    void deleteStudent(Long id);
}