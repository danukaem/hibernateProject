package com.suidls.hibernate.entity;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int userId;
    UserName userName;
    UserAddress userAddress;
    int age;


}
