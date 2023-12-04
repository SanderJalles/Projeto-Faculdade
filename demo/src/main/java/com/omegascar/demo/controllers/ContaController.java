package com.omegascar.demo.controllers;


import com.omegascar.demo.entities.Conta;
import com.omegascar.demo.services.CarroService;
import com.omegascar.demo.services.ContaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping (value = "/contas")
public class ContaController {

    @Autowired
    ContaService contaService;

    @PostMapping("/registrarconta")
    public void registrarconta(@RequestBody @Valid Conta conta){
        contaService.registrarConta(conta);
    }
    @PutMapping("/editarconta/{id}")
    public void editarconta(@PathVariable("id") Long id, @RequestBody @Valid Conta conta){
    ContaService.editarConta(id, conta);
    }

    @DeleteMapping("/deletarconta/{id}")
    public void deletarConta(@PathVariable("id") Long id) {contaService.deleteConta(id);}

    @GetMapping
    public List<Conta> getContas(){
        List<Conta> contas = contaService.getAllContas();
        return contas;
    }
}

