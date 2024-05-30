package com.example.CP_simulazione1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "titolo", nullable = false)
    private String title;
    @Column (name = "data_di_pubblicazione", nullable = true)
    private Date PublicationYear;
    @Column (name = "genere", nullable = true)
    private String genre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(Date dateOfBirth) {
        this.PublicationYear = dateOfBirth;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
