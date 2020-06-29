package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.Student;
import com.example.springbootdemo.repository.StudentRepository;
import com.example.springbootdemo.service.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class studentController {
    @Autowired
    private StudentRepository repository;
    @Autowired
    private PrinterService service;

    @RequestMapping(value="/welcome")
    public String welcome(){
        return "Welcome to student home.";
    }
    @RequestMapping(value="/sayhi", method = RequestMethod.GET)
    public String sayhi(@RequestParam String id){
        Optional<Student> s= repository.findById(Long.parseLong(id));
        if(s.isPresent()){
            return service.printHi(s.get());
        }
        return "no student found";
    }
}
