package com.example.demo_webApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication2.class, args);
    }

    @GetMapping("/v2/ciao/{provincia}")
    public Saluto saluta(@RequestParam String nome, @PathVariable String provincia) {
        String messaggio = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new Saluto(nome, provincia, messaggio);
    }

    static class Saluto {
        private String nome;
        private String provincia;
        private String saluto;

        public Saluto(String nome, String provincia, String saluto) {
            this.nome = nome;
            this.provincia = provincia;
            this.saluto = saluto;
        }

        // Getters e setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getProvincia() {
            return provincia;
        }

        public void setProvincia(String provincia) {
            this.provincia = provincia;
        }

        public String getSaluto() {
            return saluto;
        }

        public void setSaluto(String saluto) {
            this.saluto = saluto;
        }
    }
}
