package com.suidls.hibernate.repository;

import com.suidls.hibernate.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
