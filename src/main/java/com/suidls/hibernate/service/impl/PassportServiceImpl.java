package com.suidls.hibernate.service.impl;

import com.suidls.hibernate.entity.PassportDetail;
import com.suidls.hibernate.repository.PassportRepository;
import com.suidls.hibernate.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PassportServiceImpl implements PassportService {

    @Autowired
    PassportRepository passportRepository;

    @Override
    public PassportDetail savePassportDetail(PassportDetail passportDetail) {
        return passportRepository.save(passportDetail);
    }

    @Override
    public List<PassportDetail> getPassportDetails() {
        return passportRepository.findAll();
    }
}
