package com.example.CP_simulazione1.controllers;

import com.example.CP_simulazione1.dtos.LibroDTO;
import com.example.CP_simulazione1.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libri")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public LibroDTO createLibro(@RequestBody LibroDTO libroDto) {
        return libroService.createLibro(libroDto);
    }

    @GetMapping
    public List<LibroDTO> getAllLibri() {
        return libroService.getAllLibri();
    }

    @GetMapping("/{id}")
    public LibroDTO getLibroByID(@PathVariable Long id) {
        return libroService.getLibroByID(id);
    }

    @PutMapping("/{id}")
    public LibroDTO updateLibro(@PathVariable Long id, @RequestBody LibroDTO libroDto) {
        libroDto.setId(id);
        return libroService.updateLibro(libroDto,id);
    }

    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable Long id) {
        libroService.deleteLibro(id);
    }
}
