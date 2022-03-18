package br.com.viajem.viajem.controller.request.compra;

import br.com.viajem.viajem.model.Passageiro;

import javax.validation.constraints.NotNull;

public class PassageiroRequest {

    @NotNull
    private String nome;

    @NotNull
    private String sobrenome;

    @NotNull
    private Integer idade;

    @NotNull
    private String cpf;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

}
