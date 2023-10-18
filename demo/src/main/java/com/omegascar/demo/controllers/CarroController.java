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

    @GetMapping
    public List<Carro> getCarros() {
        Carro p1 = new Carro("Honda Civic", 120000.0);
        Carro p2 = new Carro("Toyota Corolla GR", 140000.0);
        Carro p3 = new Carro("Audi TTrs", 220000.0);

        List<Carro> carros = Arrays.asList(p1, p2, p3);
        return carros;
    }
}

