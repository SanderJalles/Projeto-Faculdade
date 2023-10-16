package com.omegascar.demo.entities.Serviços;

public class Customizacao extends Servico {
   private String tipoCustomizacao;

    public Customizacao(Long id, String nome, double preco) {
        super(id, nome, preco);
        this.tipoCustomizacao = tipoCustomizacao;
    }

    public String getTipoCustomizacao() {
        return tipoCustomizacao;
    }

    public void setTipoCustomizacao(String tipoCustomizacao) {
        this.tipoCustomizacao = tipoCustomizacao;
    }
}
