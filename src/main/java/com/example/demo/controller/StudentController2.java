package com.example.demo.controller;

import com.example.demo.model.Student2;
import com.example.demo.service.StudentService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController     //object created in ioc constructor
public class StudentController2 {
    @Autowired
    StudentService2 s2;  //s2 is not and object, it is an object reference

    @GetMapping("getAllStudents")  //api endpoints
    public List<Student2> getAllStudents(){
        return s2.getAllStudents();      //
    }
}
