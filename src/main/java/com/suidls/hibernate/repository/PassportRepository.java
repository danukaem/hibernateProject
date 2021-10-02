package com.suidls.hibernate.repository;

import com.suidls.hibernate.entity.PassportDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface PassportRepository extends JpaRepository<PassportDetail, Integer> {



    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update  PassportDetail  set country = ?2 where passportId =?1")
    int changePassport(int id, String counrty);


}
