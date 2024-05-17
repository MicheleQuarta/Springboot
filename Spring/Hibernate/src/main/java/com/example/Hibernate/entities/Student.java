package com.example.Hibernate.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name  = "last_name ", nullable = false)
    private String lastName;

    @Column(name = "first_name ",nullable = false)
    private String firstName;

    @Column(name = "email",nullable = false)
    private String email;
}

