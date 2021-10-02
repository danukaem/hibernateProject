package com.suidls.hibernate.repository;

import com.suidls.hibernate.entity.PassportDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PassportRepository extends JpaRepository<PassportDetail, Integer> {

    @Query(value = "select pd from PassportDetail pd where pd.country= ?1 ")
    List<PassportDetail> aaaByCountry(String conty);

    @Query(value = "select * from passport_detail pd where pd.country= ?1 ",nativeQuery = true)
    List<PassportDetail> bbbByCountry(String conty);

//    List<PassportDetail> cccByCountry(String conty);

//    List<PassportDetail> dddByCountry(String name);

    List<PassportDetail> eeeByCountry(String conty);



}
