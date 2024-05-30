package com.example.CP_simulazione1.converters;

import com.example.CP_simulazione1.dtos.AutoreDto;
import com.example.CP_simulazione1.dtos.LibroDTO;
import com.example.CP_simulazione1.entities.Autore;
import com.example.CP_simulazione1.entities.Libro;

public class LibriConverter {
    public static Libro dtoToEntity(LibroDTO libroDTO){
        Libro Libro = new Libro();
        Libro.setId(libroDTO.getId());
        Libro.setTitle(libroDTO.getTitle());
        Libro.setGenre(libroDTO.getGenre());
        Libro.setPublicationYear(libroDTO.getPublicationYear());

        return Libro;
    }
    public static LibroDTO entityToDto(Libro libro){
        LibroDTO libroDTO = new LibroDTO();
        libroDTO.setId(libro.getId());
        libroDTO.setTitle(libro.getTitle());
        libroDTO.setGenre(libro.getGenre());
        libroDTO.setPublicationYear(libro.getPublicationYear());

        return libroDTO;
    }
}
