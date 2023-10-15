package com.example.StudentApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.StudentApp.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
}
