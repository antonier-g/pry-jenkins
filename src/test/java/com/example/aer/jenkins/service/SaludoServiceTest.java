package com.example.aer.jenkins.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaludoServiceTest {

    private final SaludoService saludoService = new SaludoService();

    @Test
    public void testSaludar() {
        String resultado = saludoService.saludar("Antonio");
        assertEquals("Hola123, Antonio!", resultado);
    }
}

