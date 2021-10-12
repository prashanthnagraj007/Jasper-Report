package com.example.Jasper.service;

import com.example.Jasper.entity.Student;
import com.example.Jasper.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getList() {

        return studentRepository.findAll();
    }
}