package br.com.viajem.viajem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity(name = "tb_pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, Integer idade, String email, String senha, String cpf, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

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
}
