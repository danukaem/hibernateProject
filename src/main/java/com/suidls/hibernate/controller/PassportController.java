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

    @GetMapping("/aaa")
    public List<PassportDetail> aaa() {
        return passportRepository.aaaByCountry("sri lanka");
    }

    @GetMapping("/bbb")
    public List<PassportDetail> bbb() {
        return passportRepository.bbbByCountry("canada");
    }

    @GetMapping("/ccc")
    public List<PassportDetail> ccc() {
        return passportRepository.cccByCountry("canada");
    }

    @GetMapping("/ddd")
    public List<PassportDetail> ddd() {
        return passportRepository.dddByCountry("kasun");
    }

}
