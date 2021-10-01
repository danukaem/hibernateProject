package com.suidls.hibernate.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int userId;
    UserName userName;
    UserAddress userAddress;

    @OneToOne(cascade = CascadeType.ALL)
    Student student;
    int age;


}
