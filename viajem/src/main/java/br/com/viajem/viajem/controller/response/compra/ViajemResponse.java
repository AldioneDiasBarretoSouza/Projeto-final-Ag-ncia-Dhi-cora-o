package br.com.viajem.viajem.controller.response.compra;

import br.com.viajem.viajem.model.Viajem;

public class ViajemResponse {

    private Integer id;

    private String origem;

    private String destino;

    private String dataIda;

    public ViajemResponse(Viajem viajem) {
        this.id = viajem.getId();
        this.origem = viajem.getOrigem();
        this.destino = viajem.getDestino();
        this.dataIda = viajem.getDataIda();
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
}
