package com.example.CustomQuery2.controllers;


import com.example.CustomQuery2.entities.Flight;
import com.example.CustomQuery2.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flights")
    public void provisionFlights(@RequestParam(required = false, defaultValue = "100") int n) {
        flightService.provisionFlights(n);
    }

    @GetMapping("/flights/all")
    public Page<Flight> getAllFlights(@RequestParam(defaultValue = "0") int page,
                                      @RequestParam(defaultValue = "10") int size) {
        return flightService.getAllFlights(page, size);
    }

    @GetMapping("/flights/ontime")
    public List<Flight> getOnTimeFlights() {
        return flightService.getOnTimeFlights();
    }

    @GetMapping("/flights/custom/{status1}/{status2}")
    public List<Flight> getCustomFlights(@PathVariable String status1, @PathVariable String status2) {
        return flightService.getCustomFlights(status1, status2);
    }
}

