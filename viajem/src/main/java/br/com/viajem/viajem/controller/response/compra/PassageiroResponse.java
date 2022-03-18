package br.com.viajem.viajem.controller.response.compra;

import br.com.viajem.viajem.model.Passageiro;

public class PassageiroResponse {

    private Integer id;
    private String nome;

    public PassageiroResponse(Passageiro passageiro) {
        this.id = passageiro.getId();
        this.nome = passageiro.getNome();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
