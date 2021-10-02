package com.suidls.hibernate.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int personId;
    String name;
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
