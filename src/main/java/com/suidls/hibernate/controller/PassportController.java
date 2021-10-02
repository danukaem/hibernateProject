package com.suidls.hibernate.controller;

import com.suidls.hibernate.entity.PassportDetail;
import com.suidls.hibernate.repository.PassportRepository;
import com.suidls.hibernate.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passport")
public class PassportController {

    @Autowired
    PassportService passportService;
    @Autowired
    PassportRepository passportRepository;

    @PostMapping("/savePassport")
    public PassportDetail savePassportDetails(@RequestBody PassportDetail passportDetail) {

        return passportService.savePassportDetail(passportDetail);
    }


    @GetMapping("/getPassportDetails")
    public List<PassportDetail> getPassportDetails() {
        return passportService.getPassportDetails();
    }


    @GetMapping("/changePassport")
    public  Integer changePassport() {
        return passportRepository.changePassport(1,"dubai");
    }




}
