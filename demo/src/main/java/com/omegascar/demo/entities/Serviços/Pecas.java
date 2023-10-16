package com.omegascar.demo.entities.Serviços;

public class Pecas extends Servico{
    private String tipoPecas;

    public Pecas (Long id, String nome, double preco){
        super(id, nome, preco);
        this.tipoPecas = tipoPecas;
    }

    public String getTipoPecas() {
        return tipoPecas;
    }

    public void setTipoPecas(String tipoPecas) {
        this.tipoPecas = tipoPecas;
    }
}
