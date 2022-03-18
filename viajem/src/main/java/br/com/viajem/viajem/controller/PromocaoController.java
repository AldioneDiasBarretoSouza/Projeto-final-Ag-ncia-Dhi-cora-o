package br.com.viajem.viajem.controller;

import br.com.viajem.viajem.controller.request.promocao.PromocaoRequest;
import br.com.viajem.viajem.controller.response.promocao.PromocaoResponse;
import br.com.viajem.viajem.model.Promocao;
import br.com.viajem.viajem.repository.PromocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/promocoes")
public class PromocaoController {

    @Autowired
    private PromocaoRepository repository;

    @PostMapping
    public ResponseEntity<PromocaoResponse> cadastrarPromocao(@Valid @RequestBody PromocaoRequest request) {
        Promocao promocao = request.paraEntidade();

        repository.save(promocao);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(promocao.getId())
                .toUri();
        return ResponseEntity.created(uri).body(new PromocaoResponse(promocao));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PromocaoResponse> consultarPromocao(@PathVariable Integer id) {
        Promocao promocao = repository.getById(id);

        return ResponseEntity.ok(new PromocaoResponse(promocao.getId(), promocao));
    }

    @GetMapping
    public ResponseEntity<List<PromocaoResponse>> listarPromocoes() {
        List<PromocaoResponse> promocoes = repository.findAll().stream().map(p -> new PromocaoResponse(p)).collect(Collectors.toList());

        return ResponseEntity.ok(promocoes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PromocaoResponse> atualizar(@PathVariable Integer id, @RequestBody @Valid PromocaoRequest request) {
        Optional<Promocao> promocaoEncontrado = repository.findById(id);
        if(promocaoEncontrado.isPresent()) {
            repository.save(promocaoEncontrado.get());
        }
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> remover(@PathVariable Integer id) {
        Optional<Promocao> optional = repository.findById(id);
        if(optional.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}
