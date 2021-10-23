package com.suidls.hibernate.service.impl;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.suidls.hibernate.entity.StudentFire;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Service
public class StudentFireServiceImpl {

    public ApiFuture<Void> saveStudentFire(StudentFire studentFire) throws ExecutionException, InterruptedException {

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("studentList");
//        DatabaseReference usersRef = ref.child("users");

        Map<String, StudentFire> users = new HashMap<>();
        users.put( "1", new StudentFire(studentFire.getAge(),studentFire.getName()));
        users.put( "2", new StudentFire(studentFire.getAge(),studentFire.getName()));
        users.put( "3", new StudentFire(studentFire.getAge(),studentFire.getName()));
        users.put( "4", new StudentFire(studentFire.getAge(),studentFire.getName()));
        users.put( "5", new StudentFire(studentFire.getAge(),studentFire.getName()));

//        usersRef.setValueAsync(users);
        ApiFuture<Void> voidApiFuture = ref.setValueAsync(users);

        return voidApiFuture;
    }




}


