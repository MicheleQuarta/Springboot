package com.example.CP_simulazione1.repository;

import com.example.CP_simulazione1.entities.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoreRepository extends JpaRepository<Autore,Long> {
}
