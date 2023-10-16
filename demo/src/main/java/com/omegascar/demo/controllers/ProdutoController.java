package com.omegascar.demo.controllers;

import com.omegascar.demo.entities.Produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.omegascar.demo.services.ProdutoService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @PostMapping("/registrarcarro")
    public void registrarcarro(@RequestBody @Valid Produto produto) {
        produtoService.registrarProduto(produto);
    }

    @GetMapping
    public List<Produto> getProdutos() {
        Produto p1 = new Produto("Honda Civic", 120000.0);
        Produto p2 = new Produto("Toyota Corolla GR", 140000.0);
        Produto p3 = new Produto("Audi TTrs", 220000.0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3);
        return produtos;
    }
}

