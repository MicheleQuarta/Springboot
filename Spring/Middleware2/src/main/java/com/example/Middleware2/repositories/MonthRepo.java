package com.example.Middleware2.repositories;

import com.example.Middleware2.entities.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepo extends JpaRepository<Month, Long> {

}
