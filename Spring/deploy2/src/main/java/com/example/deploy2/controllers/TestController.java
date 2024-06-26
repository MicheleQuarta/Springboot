package com.example.deploy2.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@Profile("test")
@RestController
public class TestController {

    @GetMapping("/sum")
    public int getSum() {
        return generateRandomNumber() + generateRandomNumber();
    }

    private int generateRandomNumber() {
        return new Random().nextInt(100);
    }
}
