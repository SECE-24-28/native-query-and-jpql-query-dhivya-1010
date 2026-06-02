package com.example.demo.controller;

import com.example.demo.model.Student4;
import com.example.demo.service.StudentService4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController4 {

    @Autowired
    StudentService4 s4;
    @GetMapping("student4")
    public List<Student4> getStudent4(){
        return s4.getStudent4();
    }
    @GetMapping("student4/{rno}")
    public Student4 getStud4ByNo(@PathVariable("rno") int rno){  //if both are same name, can use like (@PathVariable int rno)

        return s4.getStud4ByNo(rno);
    }

    @PostMapping("student4")
    public String addStud4(@RequestBody Student4 std4){

        return s4.addStud4(std4);
    }

    @PutMapping("student4")
    public String updateStud4(@RequestBody Student4 std4){
        return s4.updateStud4(std4);
    }

    @DeleteMapping("student4/{rno}")
    public String deleteStud4(@PathVariable("rno") int rno){
        return s4.deleteStud4(rno);
    }
    @DeleteMapping("student4")
    public String deleteAllStud4(){
        return s4.deleteAllStud4();
    }
}
