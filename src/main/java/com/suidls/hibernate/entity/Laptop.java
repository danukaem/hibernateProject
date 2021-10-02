package com.suidls.hibernate.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
//@Data
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

    public Laptop() {
    }

    public Laptop(int laptopId, String brand, String color, int ram, Student student) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.color = color;
        this.ram = ram;
        this.student = student;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @JsonBackReference
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

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
