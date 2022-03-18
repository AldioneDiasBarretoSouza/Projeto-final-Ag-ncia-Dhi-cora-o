package br.com.viajem.viajem.controller.request.promocao;

import br.com.viajem.viajem.model.Promocao;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class PromocaoRequest {

    @NotNull
    private String destino;

    @NotNull
    private BigDecimal desconto;

    @NotNull
    private String urlImg;

    public String getDestino() {
        return destino;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public Promocao paraEntidade() {
        return new Promocao(destino, desconto, urlImg);
    }
}
