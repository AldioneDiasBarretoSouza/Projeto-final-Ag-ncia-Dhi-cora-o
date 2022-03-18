package br.com.viajem.viajem.controller.request.compra;

import br.com.viajem.viajem.model.Viajem;

import javax.validation.constraints.NotNull;

public class ViajemRequest {

    @NotNull
    private String origem;

    @NotNull
    private String destino;

    @NotNull
    private String dataIda;

    private String dataVolta;

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
}
