package com.example.CP_simulazione1.converters;

import com.example.CP_simulazione1.dtos.AutoreDto;
import com.example.CP_simulazione1.entities.Autore;

public class AutoreConverter {
    public static Autore dtoToEntity(AutoreDto autoreDto){
        Autore autore = new Autore();
        autore.setId(autoreDto.getId());
        autore.setName(autoreDto.getName());
        autore.setNationality(autoreDto.getNationality());
        autore.setPublicationYear(autoreDto.getPublicationYear());

        return autore;
    }
    public static AutoreDto entityToDto(Autore autore){
        AutoreDto autoreDto = new AutoreDto();
        autoreDto.setId(autore.getId());
        autoreDto.setName(autore.getName());
        autoreDto.setNationality(autore.getNationality());
        autoreDto.setPublicationYear(autore.getPublicationYear());

        return autoreDto;
    }
}
