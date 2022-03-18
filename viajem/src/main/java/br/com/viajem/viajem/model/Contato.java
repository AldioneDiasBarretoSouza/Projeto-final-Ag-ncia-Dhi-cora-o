package br.com.viajem.viajem.model;

import br.com.viajem.viajem.controller.request.contato.ContatoRequest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "tb_contato")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String nome;

    @NotNull
    private String sobrenome;

    @NotNull
    private String email;

    @NotNull
    private String descricao;

    public Contato() {
    }

    public Contato(String nome, String sobrenome, String email, String descricao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.descricao = descricao;
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

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void atualizarDados(ContatoRequest request) {
        this.nome = request.getNome();
        this.sobrenome = request.getSobrenome();
        this.email = request.getEmail();
        this.descricao = request.getDescricao();
    }
}
