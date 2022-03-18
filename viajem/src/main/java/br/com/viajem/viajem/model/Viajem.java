package br.com.viajem.viajem.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "tb_viajem")
public class Viajem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String origem;

    @NotNull
    private String destino;

    @NotNull
    private String dataIda;

    private String dataVolta;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Compra compra;


    public Viajem() {
    }

    public Viajem(String origem, String destino, String dataIda, String dataVolta, Compra compra) {
        this.origem = origem;
        this.destino = destino;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
        this.compra = compra;
    }

    public Integer getId() {
        return id;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String getDataIda() {
        return dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public Compra getCompra() {
        return compra;
    }
}
