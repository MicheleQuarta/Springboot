package com.example.CP_simulazione1.services;

import com.example.CP_simulazione1.converters.LibriConverter;
import com.example.CP_simulazione1.dtos.LibroDTO;
import com.example.CP_simulazione1.entities.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.CP_simulazione1.repository.LibroRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public LibroDTO createLibro(LibroDTO libroDTO) {
        Libro libro = LibriConverter.dtoToEntity(libroDTO);
        Libro libroSaved = libroRepository.save(libro);
        return LibriConverter.entityToDto(libroSaved);
    }

    public List<LibroDTO> getAllLibri() {
        List<Libro> libriList = libroRepository.findAll();
        List<LibroDTO> libriDtoList = new ArrayList<>();
        for (Libro libro : libriList) {
            libriDtoList.add(LibriConverter.entityToDto(libro));
        }
        return libriDtoList;
    }
    public LibroDTO getLibroByID(Long id) {
        Libro libro = libroRepository.findById(id).orElse(null);
        if (libro != null) {
            return LibriConverter.entityToDto(libro);
        }
        return null;
    }

    // Metodo per aggiornare un Libro
    public LibroDTO updateLibro(LibroDTO libroDTO) {
        Libro libro = libroRepository.findById(libroDTO.getId()).orElse(null);
        if (libro != null) {
            libro.setTitle(libroDTO.getTitle());
            libro.setGenre(libroDTO.getGenre());
            libro.setPublicationYear(libroDTO.getPublicationYear());
            Libro libroSaved = libroRepository.save(libro);
            return LibriConverter.entityToDto(libroSaved);
        }
        return null;
    }
    public boolean deleteLibro(Long id) {
        Libro libro = libroRepository.findById(id).orElse(null);
        if (libro != null) {
            libroRepository.delete(libro);
            return true;
        }
        return false;
    }
}

