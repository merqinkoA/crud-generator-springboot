package com.example.demo.repository;

import com.example.demo.model.Qinko;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QinkoRepository extends JpaRepository<Qinko, Long> {
    // Add custom query methods if needed
}