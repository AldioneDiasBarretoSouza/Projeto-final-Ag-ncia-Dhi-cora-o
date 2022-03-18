package br.com.viajem.viajem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity(name = "tb_promocao")
public class Promocao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String destino;

    @NotNull
    private BigDecimal desconto;

    @NotNull
    private String urlImg;

    public Promocao() {
    }

    public Promocao(String destino, BigDecimal desconto, String urlImg) {
        this.destino = destino;
        this.desconto = desconto;
        this.urlImg = urlImg;
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
