package com.example.StudentApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentApp.model.Student;
import com.example.StudentApp.repository.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository repository;

    public List<Student> getStudents(){

        List<Student> students = new ArrayList<Student>();

        repository.findAll().forEach(student -> {
            students.add(student);
        });

        return students;
    }
    
}
