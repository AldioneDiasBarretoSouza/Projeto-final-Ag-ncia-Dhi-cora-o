package br.com.viajem.viajem.controller.request.compra;

import br.com.viajem.viajem.model.Compra;

import java.util.ArrayList;
import java.util.List;

public class CompraRequest {

    private List<PassageiroRequest> passageiros = new ArrayList<>();
    private ViajemRequest viajem;

    public List<PassageiroRequest> getPassageiros() {
        return passageiros;
    }

    public ViajemRequest getViajem() {
        return viajem;
    }

    public Compra paraEntidade() {
        return new Compra(passageiros, viajem);
    }
}
