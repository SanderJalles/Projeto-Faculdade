package com.omegascar.demo.services;

import com.omegascar.demo.entities.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.omegascar.demo.repository.CarroRepository;

@Service
public class CarroService {

    private double preco;

    @Autowired
    CarroRepository carroRepository;

    @Autowired
    public CarroService() {
        this.preco = 0.0;
    }

    public void registrarCarro(Carro carro) {
        carroRepository.save(carro);
    }

    public Carro procurarPorId(long id) {
        return carroRepository.findById(id);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
