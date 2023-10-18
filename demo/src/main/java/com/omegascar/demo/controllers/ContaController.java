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

    @GetMapping
    public List<Conta>getContas(){
        Conta p1 = new Conta("Marcola", "132.234.122.44", "932218765");
        Conta p2 = new Conta("Matheus", "124.675.235.88","976542321");

        List<Conta> contas = Arrays.asList(p1,p2);
        return contas;
    }

}
