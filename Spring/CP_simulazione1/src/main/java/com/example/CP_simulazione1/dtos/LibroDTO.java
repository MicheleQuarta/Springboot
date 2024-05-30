package com.example.CP_simulazione1.dtos;

import java.util.Date;

public class LibroDTO {
    private Long id;
    private String title;
    private Date PublicationYear;
    private String genre;

    public Date getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(Date publicationYear) {
        PublicationYear = publicationYear;
    }

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




    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
