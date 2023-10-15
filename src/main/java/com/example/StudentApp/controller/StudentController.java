package com.example.StudentApp.controller;

import com.example.StudentApp.model.Student;
import com.example.StudentApp.service.StudentService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @RequestMapping("/student/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @RequestMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }

    @RequestMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @RequestMapping("/updateStudent/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable Integer id){
       studentService.updateStudent(student, id);
    }
}
