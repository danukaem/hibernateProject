package com.suidls.hibernate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {

    @Id
    @Column(name = "student_id")
    int studentId;
    String studentName;


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
