package com.suidls.hibernate.repository;

import com.suidls.hibernate.entity.PassportDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PassportRepository extends JpaRepository<PassportDetail, Integer> {
}
