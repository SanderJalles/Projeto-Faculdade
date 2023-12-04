package com.omegascar.demo.entities;

public class Contafunc extends Conta {
    public Contafunc(Integer id, String name, String cpf, String telefone) {
        super(id, name, cpf, telefone);
    }
    private int cod;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Contafunc(Integer id, String name, String cpf, String telefone, int cod) {
        super(id, name, cpf, telefone);
        this.cod = cod;
    }

    public Contafunc() {
        super();
    }
}
