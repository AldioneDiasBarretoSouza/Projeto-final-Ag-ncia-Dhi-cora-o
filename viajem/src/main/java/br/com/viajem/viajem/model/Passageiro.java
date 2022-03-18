package br.com.viajem.viajem.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "tb_passageiro")
public class Passageiro {

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
    private String cpf;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Compra compra;

    public Passageiro() {
    }

    public Passageiro(String nome, String sobrenome, Integer idade, String cpf, Compra compra) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.compra = compra;
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

    public String getCpf() {
        return cpf;
    }

    public Compra getCompra() {
        return compra;
    }
}
