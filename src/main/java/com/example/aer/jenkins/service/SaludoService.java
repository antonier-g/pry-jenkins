package com.example.aer.jenkins.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String saludar(String nombre) {
        return "Hola, " + nombre + "!";
    }
}

