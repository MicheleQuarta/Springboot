package com.example.demo_webApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldController {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }
    @GetMapping(path = "/ciao")
    public String ciao (@RequestParam (required = true) String nome, @RequestParam (required = false, defaultValue = "") String provincia){
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }

}
