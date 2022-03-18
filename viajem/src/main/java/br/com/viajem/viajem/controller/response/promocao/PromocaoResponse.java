package br.com.viajem.viajem.controller.response.promocao;

import br.com.viajem.viajem.model.Promocao;

import java.math.BigDecimal;

public class PromocaoResponse {

    private Integer id;
    private String destino;
    private BigDecimal desconto;
    private String urlImg;

    public PromocaoResponse(Promocao promocao) {
        this.id = promocao.getId();
        this.destino = promocao.getDestino();
    }

    public PromocaoResponse(Integer id, Promocao promocao) {
        this.id = id;
        this.destino = promocao.getDestino();
        this.desconto = promocao.getDesconto();
        this.urlImg = promocao.getUrlImg();
    }

    public Integer getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public String getUrlImg() {
        return urlImg;
    }
}
