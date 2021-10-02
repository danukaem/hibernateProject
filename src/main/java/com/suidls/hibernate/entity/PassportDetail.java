package com.suidls.hibernate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PassportDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int passportId;
    String country;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "personId")
    Person person;

    @Override
    public String toString() {
        return "PassportDetail{" +
                "passportId=" + passportId +
                ", country='" + country + '\'' +
                ", person=" + person +
                '}';
    }
}
