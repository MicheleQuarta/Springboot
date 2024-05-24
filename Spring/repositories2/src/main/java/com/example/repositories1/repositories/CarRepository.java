package com.example.repositories1.repositories;


import com.example.repositories1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}