package com.lms.librarymanagementsystem.controller;

import com.lms.librarymanagementsystem.entity.Student;
import com.lms.librarymanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;


    //create
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){

        return studentService.addStudent(student);
    }



}
