package com.suidls.hibernate.controller;

import com.suidls.hibernate.entity.Laptop;
import com.suidls.hibernate.entity.Student;
import com.suidls.hibernate.repository.StudentRepository;
import com.suidls.hibernate.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/saveLaptop")
    public Laptop saveLaptop(@RequestBody Laptop laptop) {
        return laptopService.saveLaptop(laptop);
    }

    @GetMapping("/getLaptops")
    public List<Laptop> getLaptops() {
        return laptopService.getLaptops();
    }
}
