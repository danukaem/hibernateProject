package com.suidls.hibernate.controller;

import com.google.api.core.ApiFuture;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.suidls.hibernate.entity.StudentFire;
import com.suidls.hibernate.service.impl.StudentFireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@RestController
public class StudentFireController {

    @Autowired
    StudentFireServiceImpl studentFireService;

    @PostMapping("/saveStudentFire")
    public ApiFuture<Void> saveStudentFire(@RequestBody StudentFire studentFire) throws ExecutionException, InterruptedException {
        return studentFireService.saveStudentFire(studentFire);
    }

}
