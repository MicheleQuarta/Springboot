package com.example.Middleware2.controllers;

import com.example.Middleware2.entities.Month;
import com.example.Middleware2.repositories.MonthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/months")
public class MonthController {

    @Autowired
    private MonthRepo monthRepo;

    @GetMapping
    public List<Month> getAllMonths() {
        return monthRepo.findAll();
    }

    @GetMapping("/{id}")
    public Month getMonthById(@PathVariable Long id) {
        return monthRepo.findById(id).orElseThrow(() -> new RuntimeException("Month not found with id: " + id));
    }

}