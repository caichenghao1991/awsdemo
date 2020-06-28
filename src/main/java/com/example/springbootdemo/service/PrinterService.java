package com.example.springbootdemo.service;

import com.example.springbootdemo.model.Student;

public class PrinterService {
    public String printHi(Student student){
        return "Hi "+student.getName();
    }
}
