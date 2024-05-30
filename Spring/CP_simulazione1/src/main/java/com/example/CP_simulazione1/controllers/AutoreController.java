package com.example.CP_simulazione1.controllers;

import com.example.CP_simulazione1.dtos.AutoreDto;
import com.example.CP_simulazione1.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    @PostMapping
    public AutoreDto createAutore(@RequestBody AutoreDto autoreDto) {
        return autoreService.createAutore(autoreDto);
    }

    @GetMapping
    public List<AutoreDto> getAllAutori() {
        return autoreService.getAllAutori();
    }

    @GetMapping("/{id}")
    public AutoreDto getAutoreById(@PathVariable Long id) {
        return autoreService.getAutoreByID(id);
    }

    @PutMapping("/{id}")
    public AutoreDto updateAutore(@PathVariable Long id, @RequestBody AutoreDto autoreDto) {
        autoreDto.setId(id);
        return autoreService.updateAutore(autoreDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAutore(@PathVariable Long id) {
        autoreService.deleteAutore(id);
    }
}


