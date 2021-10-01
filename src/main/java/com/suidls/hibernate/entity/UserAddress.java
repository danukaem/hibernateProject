package com.suidls.hibernate.entity;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class UserAddress {

    String buildingNo;
    String streetAddress;
    String city;
    String district;

    @Override
    public String toString() {
        return "UserAddress{" +
                "buildingNo='" + buildingNo + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
