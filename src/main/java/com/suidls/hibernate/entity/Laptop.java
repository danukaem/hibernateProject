package com.suidls.hibernate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "laptop_id")
    int laptopId;
    String brand;
    String color;
    int ram;

    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", ram=" + ram +
                ", student=" + student +
                '}';
    }
}
