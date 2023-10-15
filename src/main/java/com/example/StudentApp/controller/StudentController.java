package com.example.StudentApp.controller;

import com.example.StudentApp.model.Student;
import com.example.StudentApp.service.StudentService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
