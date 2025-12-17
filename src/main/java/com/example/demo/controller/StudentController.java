package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/postStudentData")
    public StudentEntity postStudentData(@RequestBody StudentEntity entity) {
        return studentService.addRecord(entity);
    }

    @GetMapping("/getStudentData")
    public List<StudentEntity> getStudentData() {
        return studentService.getRecords();
    }
    
    @GetMapping("/getStudentId/{id}")
    public StudentEntity getStudentId(@PathVariable Long id) {
        return studentService.getStudentRecord(id);
    }

    @PutMapping("/updateStudentRecord/{id}")
    public String updateStudentData(@PathVariable Long id, @RequestBody StudentEntity entity) {
        Optional<StudentEntity>
        return ;
    }

    @DeleteMapping("/deleteStudentRecord/{id}")
    public String deleteStudentData(@PathVariable Long id) {
        return studentService.deleteStudentRecord(id);
    }

}
