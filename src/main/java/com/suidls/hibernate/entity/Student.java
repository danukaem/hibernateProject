package com.suidls.hibernate.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Student {

    @Id
    @Column(name = "student_id")
    int studentId;
    String studentName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student", fetch = FetchType.LAZY)
    @JsonIgnore
    List<Laptop> laptops;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
