package com.example.springbootdemo.service;

import com.example.springbootdemo.model.Student;
import org.springframework.stereotype.Service;

@Service
public class PrinterService {
    public String printHi(Student student){
        return "Hi "+student.getName();
    }
}
