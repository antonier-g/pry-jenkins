package com.example.aer.jenkins.controller;


import com.example.aer.jenkins.service.SaludoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    private final SaludoService saludoService;

    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam(defaultValue = "MundoAER") String nombre) {
        return saludoService.saludar(nombre);
    }
}
