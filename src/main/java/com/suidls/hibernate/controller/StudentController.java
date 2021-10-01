package com.suidls.hibernate.controller;

import com.suidls.hibernate.entity.Student;
import com.suidls.hibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student) {

        student.setLaptops(student.getLaptops());

        System.out.println(student);
        return studentService.saveStudent(student);
    }


    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

}
