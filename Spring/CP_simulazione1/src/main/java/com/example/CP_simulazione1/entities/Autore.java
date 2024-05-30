package com.example.CP_simulazione1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Autore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "nome", nullable = false)
    private String name;
    @Column (name = "data_di_nascita", nullable = true)
    private Date publicationYear;
    @Column (name = "nazionalità", nullable = true)
    private String nationality;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Date publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
