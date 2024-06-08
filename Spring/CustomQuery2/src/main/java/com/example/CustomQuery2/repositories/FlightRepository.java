package com.example.CustomQuery2.repositories;

import com.example.CustomQuery2.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByStatus(String status);
    List<Flight> findByStatusIn(List<String> statuses);

}
