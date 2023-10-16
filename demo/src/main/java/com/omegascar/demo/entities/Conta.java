package com.omegascar.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Conta {
    @Id
    private long id;
    private String name;
    private String cpf;
    private String telefone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Conta() {
    }

    public Conta(long id, String name, String cpf, String telefone) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.telefone = telefone;
    }
}



