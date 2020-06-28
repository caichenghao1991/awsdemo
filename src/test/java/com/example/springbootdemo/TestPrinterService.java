package com.example.springbootdemo;

import com.example.springbootdemo.model.Student;
import com.example.springbootdemo.service.PrinterService;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPrinterService {
    PrinterService service =new PrinterService();
    @Test
    public void testPrintHi(){
        Student s = new Student(5L,"James",10);
        assertEquals("Hi James",service.printHi(s));
    }
}
