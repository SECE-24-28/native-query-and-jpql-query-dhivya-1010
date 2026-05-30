package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Writer{
    public void write(){
        System.out.println("i got a pen");
    }
}
