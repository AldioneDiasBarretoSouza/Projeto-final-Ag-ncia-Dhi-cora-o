package br.com.viajem.viajem.controller.request.contato;

import br.com.viajem.viajem.model.Contato;

import javax.validation.constraints.NotNull;

public class ContatoRequest {

    @NotNull
    private String nome;

    @NotNull
    private String sobrenome;

    @NotNull
    private String email;

    @NotNull
    private String descricao;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public Contato paraEntidade() {
        return new Contato(nome, sobrenome, email, descricao);
    }
}
