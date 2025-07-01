package com.example.aer.jenkins.controller;


import com.example.aer.jenkins.service.SaludoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(SaludoController.class)
public class SaludoControllerTest {

    @Autowired
    private org.springframework.test.web.servlet.MockMvc mockMvc;

    @MockBean
    private SaludoService saludoService;

    @Test
    public void testSaludoEndpoint() throws Exception {
        when(saludoService.saludar("Antonio")).thenReturn("Hola, Antonio!");

        mockMvc.perform(get("/saludo").param("nombre", "Antonio"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hola, Antonio!"));
    }
}

