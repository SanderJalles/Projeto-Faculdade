package com.omegascar.demo.services;

import com.omegascar.demo.entities.Carro;
import com.omegascar.demo.entities.Conta;
import com.omegascar.demo.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {
    @Autowired
    ContaRepository contaRepository;

    public void registrarConta(Conta conta) {
        contaRepository.save(conta);
    }

    public Conta procurarPorId(long id) {
        return contaRepository.findById(id);
    }

}
