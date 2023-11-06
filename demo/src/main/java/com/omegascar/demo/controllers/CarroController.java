package com.omegascar.demo.controllers;

import com.omegascar.demo.entities.Carro;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.omegascar.demo.services.CarroService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarroController {
    @Autowired
    CarroService carroService;

    @PostMapping("/registrarcarro")
    public void registrarcarro(@RequestBody @Valid Carro carro) {
        carroService.registrarCarro(carro);
    }

    @DeleteMapping("/deletecarro/{id}")
    public void deleteCarro(@PathVariable("id") long id) {
        carroService.deleteCarro(id);
    }

    @GetMapping
    public List<Carro> getCarros() {
        List<Carro> carros = carroService.getAllCarros();
        return carros;
    }
}

