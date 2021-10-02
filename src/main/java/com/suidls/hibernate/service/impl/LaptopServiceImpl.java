package com.suidls.hibernate.service.impl;

import com.suidls.hibernate.entity.Laptop;
import com.suidls.hibernate.repository.LaptopRepository;
import com.suidls.hibernate.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    LaptopRepository laptopRepository;

    @Override
    public Laptop saveLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @Override
    public List<Laptop> getLaptops() {
        return laptopRepository.findAll();
    }
}
