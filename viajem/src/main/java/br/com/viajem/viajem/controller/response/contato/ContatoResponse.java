package br.com.viajem.viajem.controller.response.contato;

import br.com.viajem.viajem.model.Contato;

public class ContatoResponse {

    private Integer id;
    private String nome;
    private String descricao;

    public ContatoResponse(Contato contato) {
        this.id = contato.getId();
        this.nome = contato.getNome();
    }

    public ContatoResponse(Integer id, Contato contato) {
        this.id = id;
        this.nome = contato.getNome();
        this.descricao = contato.getDescricao();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
