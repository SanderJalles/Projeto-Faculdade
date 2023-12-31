package com.omegascar.demo.repository;

import com.omegascar.demo.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
    Carro findById(long id);

}
