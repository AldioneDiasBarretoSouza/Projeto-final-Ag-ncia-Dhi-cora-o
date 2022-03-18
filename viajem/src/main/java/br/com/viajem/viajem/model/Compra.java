package br.com.viajem.viajem.model;

import br.com.viajem.viajem.controller.request.compra.PassageiroRequest;
import br.com.viajem.viajem.controller.request.compra.ViajemRequest;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "tb_compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "compra", cascade = CascadeType.PERSIST)
    private List<Passageiro> passageiros = new ArrayList<>();

    @OneToOne(mappedBy = "compra", cascade = CascadeType.PERSIST)
    private Viajem viajem;

    public Compra() {
    }

    public Compra(List<PassageiroRequest> passageiros, ViajemRequest viajem) {
        this.passageiros
                .addAll(passageiros
                        .stream()
                        .map(p ->
                                new Passageiro(p.getNome(), p.getSobrenome(), p.getIdade(), p.getCpf(), this))
                        .collect(Collectors.toList()));
        this.viajem = new Viajem(viajem.getOrigem(), viajem.getDestino(), viajem.getDataIda(), viajem.getDataVolta(), this);
    }

    public Integer getId() {
        return id;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public Viajem getViajem() {
        return viajem;
    }
}
