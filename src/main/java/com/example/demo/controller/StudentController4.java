package com.example.demo.controller;

import com.example.demo.model.Student4;
import com.example.demo.service.StudentService4;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController4 {

    @Autowired
    StudentService4 s4;
    @GetMapping("getstudent4")
    public List<Student4> getStudent4(){
        return s4.getStudent4();
    }
    @GetMapping("getUniqstudent4/{rno}")
    public Student4 getStud4ByNo(@PathVariable("rno") int rno){  //if both are same name, can use like (@PathVariable int rno)

        return s4.getStud4ByNo(rno);
    }

    @PostMapping("addStudent4")
    public String addStud4(@RequestBody Student4 std4){

        return s4.addStud4(std4);
    }

    @PutMapping("updateStudent4")
    public String updateStud4(@RequestBody Student4 std4){
        return s4.updateStud4(std4);
    }

    @DeleteMapping("deleteStudent4/{rno}")
    public String deleteStud4(@PathVariable("rno") int rno){
        return s4.deleteStud4(rno);
    }
    @DeleteMapping("delStudent4")
    public String deleteAllStud4(){
        return s4.deleteAllStud4();
    }

    @GetMapping("Cstudents4/customGet")
    public List<Student4> getCustomStud4(@Param("gender") String gender, @Param("tech") String tech){
        return s4.getCustomStud4(gender,tech);
    }

    @GetMapping("getByTech/{tech}")
    public List<Student4> getByTech(@PathVariable("tech") String tech){
        return s4.getByTech(tech);
    }
}