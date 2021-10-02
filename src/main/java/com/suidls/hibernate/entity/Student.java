package com.suidls.hibernate.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
//@Data
public class Student {

    @Id
    @Column(name = "student_id")
    int studentId;
    String studentName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student",fetch = FetchType.LAZY)
    List<Laptop>  laptops;

    public Student() {
    }

    public Student(int studentId, String studentName, List<Laptop> laptops) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.laptops = laptops;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    @JsonManagedReference
    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
