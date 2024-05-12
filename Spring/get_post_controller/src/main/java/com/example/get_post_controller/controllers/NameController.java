package com.example.get_post_controller.controllers;

import com.example.get_post_controller.services.HelloWorldServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {
    @GetMapping("/hello")
    public String getHello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
    @PostMapping("/reverse")
    public String postReverse(@RequestParam String name) {
        int length = name.length();
        StringBuilder reversedName = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            reversedName.append(name.charAt(i));
        }
        return reversedName.toString();
    }

}
