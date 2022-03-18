package br.com.viajem.viajem.controller.response.pessoa;


import br.com.viajem.viajem.model.Pessoa;

public class PessoaResponse {

    private Integer id;
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String email;
    private String telefone;

    public PessoaResponse(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
    }

    public PessoaResponse(Integer id, Pessoa pessoa) {
        this.id = id;
        this.nome = pessoa.getNome();
        this.sobrenome = pessoa.getSobrenome();
        this.idade = pessoa.getIdade();
        this.email = pessoa.getEmail();
        this.telefone = pessoa.getTelefone();
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

    public String getTelefone() {
        return telefone;
    }
}
