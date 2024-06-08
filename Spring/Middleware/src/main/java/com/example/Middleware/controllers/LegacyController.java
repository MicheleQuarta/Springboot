package com.example.Middleware.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class LegacyController {

    @GetMapping("/legacy")
    public String getLegacyMessage() {
        return "This is just old code";
    }
}
