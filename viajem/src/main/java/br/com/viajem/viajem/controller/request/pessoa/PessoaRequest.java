package br.com.viajem.viajem.controller.request.pessoa;

import br.com.viajem.viajem.model.Pessoa;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class PessoaRequest {
    @NotNull
    private String nome;

    @NotNull
    private String sobrenome;

    @NotNull
    private Integer idade;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String senha;

    @NotNull
    private String cpf;

    @NotNull
    private String telefone;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Pessoa paraEntidade() {
        return new Pessoa(nome, sobrenome, idade, email, senha, cpf, telefone);
    }
}
