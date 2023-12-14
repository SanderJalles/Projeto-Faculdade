package com.omegascar.demo.services;

import com.omegascar.demo.entities.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.omegascar.demo.repository.CarroRepository;

import java.util.List;

@Service
public class CarroService {
    private double preco;
    @Autowired
    CarroRepository carroRepository;
    @Autowired
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public Carro registrarCarro (Carro carro) {
        return carroRepository.save(carro);
    }
    public void deleteCarro(long id) {
        carroRepository.delete(procurarPorId(id));
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

    public List<Carro> getAllCarros() {
        return (List<Carro>) carroRepository.findAll();
    }

    public void editCarro(long id, Carro novoCarro) {
        Carro carroExistente = procurarPorId(id);

        if (carroExistente != null) {
            carroExistente.setName(novoCarro.getName());
            carroExistente.setPreco(novoCarro.getPreco());

            carroRepository.save(carroExistente);
        }
    }

}

