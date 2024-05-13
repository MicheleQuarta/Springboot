package com.example.CORS.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class corsController {

    @GetMapping("/getName")
    public String getName(@RequestParam String name) {
        return "Nome: " + name;
    }

    @PostMapping("/reverseName")
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name);
        return "Nome al contrario: " + reversedName.reverse().toString();
    }
}
