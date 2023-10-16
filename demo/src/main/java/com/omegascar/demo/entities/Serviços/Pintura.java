package com.omegascar.demo.entities.Serviços;

public class Pintura extends Servico{
    private String tipoPintura;

    public Pintura(Long id, String nome, double preco) {
        super(id, nome, preco);
        this.tipoPintura = tipoPintura;
    }

    public String getTipoPintura() {
        return tipoPintura;
    }

    public void setTipoPintura(String tipoPintura) {
        this.tipoPintura = tipoPintura;
    }
}
