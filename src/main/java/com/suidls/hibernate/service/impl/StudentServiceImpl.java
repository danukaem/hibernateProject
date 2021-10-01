package com.suidls.hibernate.service.impl;

import com.suidls.hibernate.entity.Student;
import com.suidls.hibernate.repository.StudentRepository;
import com.suidls.hibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
