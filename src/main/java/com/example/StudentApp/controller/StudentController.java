package com.example.StudentApp.controller;

import com.example.StudentApp.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping("/student")
    public Student getStudent(){
        return new Student(1,"Hamit","MOUSSA","Bd de Gaule","it@gmail.com", 120757);
    }
}
