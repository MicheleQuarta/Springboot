package com.example.CP_simulazione1.services;

import com.example.CP_simulazione1.converters.AutoreConverter;
import com.example.CP_simulazione1.dtos.AutoreDto;
import com.example.CP_simulazione1.entities.Autore;
import com.example.CP_simulazione1.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

import java.util.List;

@Service
public class AutoreService {
    @Autowired
    private AutoreRepository autoreRepository;
    public AutoreDto createAutore(AutoreDto autoreDto){
        Autore autore = new Autore();
        autore = AutoreConverter.dtoToEntity(autoreDto);
        Autore autoreSaved = autoreRepository.save(autore);
        return AutoreConverter.entityToDto(autoreSaved);
    }
    public List<AutoreDto> getAllAutori() {
        List<Autore> autoriList = autoreRepository.findAll();
        List<AutoreDto> autoriDtoList = new ArrayList<>();
        for (Autore autore : autoriList) {
            autoriDtoList.add(AutoreConverter.entityToDto(autore));
        }
        return autoriDtoList;
    }

    public AutoreDto getAutoreByID(Long id) {
        Autore autore = autoreRepository.findById(id).orElse(null);
        if (autore != null) {
            return AutoreConverter.entityToDto(autore);
        }
        return null;
    }

    public AutoreDto updateAutore(AutoreDto autoreDto, Long id) {
        Autore autore = autoreRepository.findById(id).orElse(null);
        if (autore != null) {
            autore.setName(autoreDto.getName());
            autore.setNationality(autoreDto.getNationality());
            autore.setPublicationYear(autoreDto.getPublicationYear());
            Autore autoreSaved = autoreRepository.save(autore);
            return AutoreConverter.entityToDto(autoreSaved);
        }
        return null;
    }
    public boolean deleteAutore(Long id) {
        Autore autore = autoreRepository.findById(id).orElse(null);
        if (autore != null) {
            autoreRepository.delete(autore);
            return true;
        }
        return false;
    }
}
