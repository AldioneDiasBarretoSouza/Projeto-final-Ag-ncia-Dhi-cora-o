package br.com.viajem.viajem.controller.response.compra;

import br.com.viajem.viajem.model.Compra;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompraResponse {

    private List<PassageiroResponse> passageiros = new ArrayList<>();
    private ViajemResponse viajem;

    public CompraResponse(Compra compra) {
        this.passageiros
                .addAll(compra.getPassageiros()
                        .stream()
                        .map(passageiro ->
                                new PassageiroResponse(passageiro))
                        .collect(Collectors.toList()));
        this.viajem = new ViajemResponse(compra.getViajem());
    }

    public List<PassageiroResponse> getPassageiros() {
        return passageiros;
    }

    public ViajemResponse getViajem() {
        return viajem;
    }
}
