package com.omegascar.demo.repository;

import com.omegascar.demo.entities.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta,Integer > {
    Conta findById(long id);
}
