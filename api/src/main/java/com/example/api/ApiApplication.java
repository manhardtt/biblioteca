package com.exemplo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication faz o Spring procurar Controllers, Repositories, Services e Entidades
// NESTE pacote (com.exemplo.api) e nos subpacotes.
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args); // sobe o servidor na porta 8080
    }
}