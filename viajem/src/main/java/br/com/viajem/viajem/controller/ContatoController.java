package br.com.viajem.viajem.controller;

import br.com.viajem.viajem.controller.request.contato.ContatoRequest;
import br.com.viajem.viajem.controller.response.contato.ContatoResponse;
import br.com.viajem.viajem.model.Contato;
import br.com.viajem.viajem.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @Autowired
    private ContatoRepository repository;

    @PostMapping
    public ResponseEntity<ContatoResponse> cadastrarContato(@Valid @RequestBody ContatoRequest request) {
        Contato contato = request.paraEntidade();

        repository.save(contato);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(contato.getId())
                .toUri();
        return ResponseEntity.created(uri).body(new ContatoResponse(contato));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContatoResponse> consultarContato(@PathVariable Integer id) {
        Contato contato = repository.getById(id);

        return ResponseEntity.ok(new ContatoResponse(contato.getId(), contato));
    }

    @GetMapping
    public ResponseEntity<List<ContatoResponse>> listarContatos() {
        List<ContatoResponse> contatos = repository.findAll().stream().map(c -> new ContatoResponse(c)).collect(Collectors.toList());

        return ResponseEntity.ok(contatos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContatoResponse> atualizar(@PathVariable Integer id, @RequestBody @Valid ContatoRequest request) {
        Optional<Contato> contatoEncontrado = repository.findById(id);
        if(contatoEncontrado.isPresent()) {
            repository.save(contatoEncontrado.get());
        }
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> remover(@PathVariable Integer id) {
        Optional<Contato> optional = repository.findById(id);
        if(optional.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
