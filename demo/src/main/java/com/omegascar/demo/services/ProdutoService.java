package com.omegascar.demo.services;

import com.omegascar.demo.entities.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.omegascar.demo.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private double preco;

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService() {
        this.preco = 0.0;
    }

    public void registrarProduto(Produto produto) {
        // Lógica para registrar o produto, se necessário
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
