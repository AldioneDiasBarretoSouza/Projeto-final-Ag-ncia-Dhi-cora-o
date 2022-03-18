package br.com.viajem.viajem.controller;

import br.com.viajem.viajem.controller.request.compra.CompraRequest;
import br.com.viajem.viajem.controller.response.compra.CompraResponse;
import br.com.viajem.viajem.model.Compra;
import br.com.viajem.viajem.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraRepository repository;

    @PostMapping
    public ResponseEntity<CompraResponse> realizarCompra(@Valid @RequestBody CompraRequest request) {
        Compra compra = request.paraEntidade();

        compra = repository.save(compra);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(compra.getId())
                .toUri();

        return ResponseEntity.created(uri).body(new CompraResponse(compra));
    }
}
