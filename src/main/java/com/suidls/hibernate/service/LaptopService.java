package com.suidls.hibernate.service;

import com.suidls.hibernate.entity.Laptop;

import java.util.List;

public interface LaptopService {

    Laptop saveLaptop(Laptop laptop);

    List<Laptop> getLaptops();
}
