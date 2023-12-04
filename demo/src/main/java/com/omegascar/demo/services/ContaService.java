package com.omegascar.demo.services;

import com.omegascar.demo.entities.Carro;
import com.omegascar.demo.entities.Conta;
import com.omegascar.demo.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    @Autowired
    ContaRepository contaRepository;

    public static void editarConta(Long id, Conta conta) {
    }

    public void registrarConta(Conta conta) {
        contaRepository.save(conta);
    }

    public Conta procurarPorId(long id) {
        return contaRepository.findById(id);
    }

    public void deleteConta(Long id) {
    }

    public List<Conta> getAllContas() { return (List<Conta>) contaRepository.findAll();}
}
