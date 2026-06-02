package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //for getter setter from lambok
@AllArgsConstructor //for constructor
@NoArgsConstructor //non param constructor
@Entity //object will be converted into relation (table)
public class Student4 {
    @Id
    private int rno;
    private String name;
    private String gender;
    private String tech;


}
