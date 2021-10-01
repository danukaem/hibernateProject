package com.suidls.hibernate.service;

import com.suidls.hibernate.entity.Student;

import java.util.List;

public interface StudentService {
     Student saveStudent(Student student);

     List<Student> getStudents();

}
