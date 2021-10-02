package com.suidls.hibernate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@NamedQueries(value = {
//        @NamedQuery(name = "PassportDetail.cccByCountry", query = "select p from PassportDetail p where p.country = ?1"),
//        @NamedQuery(name = "PassportDetail.dddByCountry", query = "select p from PassportDetail p where p.person.name = ?1")
//})

@NamedNativeQueries(value = {
        @NamedNativeQuery(name = "PassportDetail.eeeByCountry", query = "select * from passport_detail pd where pd.country = ?1", resultClass = PassportDetail.class)
})
public class PassportDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int passportId;
    String country;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "personId", unique = true)
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
