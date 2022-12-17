package com.example.billingservice.repository;

import com.example.billingservice.entities.Bill;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories
public interface BillRepository extends JpaRepository<Bill,Long> {


}
