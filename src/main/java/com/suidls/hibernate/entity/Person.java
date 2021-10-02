package com.suidls.hibernate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int personId;
    String name;
    @Column(length = 10,unique = true)
    String nic;

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
