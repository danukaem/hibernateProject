package com.suidls.hibernate.service;

import com.suidls.hibernate.entity.PassportDetail;

import java.util.List;

public interface PassportService {

    PassportDetail savePassportDetail(PassportDetail passportDetail);

    List<PassportDetail> getPassportDetails();

}
