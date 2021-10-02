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

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "students", fetch = FetchType.LAZY)
    @JsonIgnore
    List<Laptop> laptops;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
