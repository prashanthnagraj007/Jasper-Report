package com.example.Jasper.controller;

import com.example.Jasper.entity.Student;
import com.example.Jasper.service.ReportService;
import com.example.Jasper.service.StudentService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/students")

public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ReportService service;

    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException, JRException {
        return service.exportReport(format);
    }

    @GetMapping(value = "/")
    public List<Student> getList() {
        return studentService.getList();
    }
}

