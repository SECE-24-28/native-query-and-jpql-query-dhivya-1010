package com.example.demo.service;

import com.example.demo.model.Student2;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class StudentService2 {

    List<Student2> students = Arrays.asList(
            new Student2(1,"dhivya","springboot"),
            new Student2(3,"abc","react")
    );
    public List<Student2> getAllStudents(){
            return students;
    }
}
