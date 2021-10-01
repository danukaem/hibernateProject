package com.suidls.hibernate.entity;

import lombok.Data;

import javax.persistence.Embeddable;
@Data
@Embeddable
public class UserName {
    String firstName;
    String middleName;
    String lastName;


    @Override
    public String toString() {
        return "UserName{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
