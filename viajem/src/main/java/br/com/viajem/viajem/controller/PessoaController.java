package br.com.viajem.viajem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viajem.viajem.model.Pessoa;
import br.com.viajem.viajem.services.pessoaService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private pessoaService PessoaService;

	@GetMapping
	public List<Pessoa> getAllCliente() {
		return PessoaService.findAll();
	}

	@GetMapping(path = "/{id}")
	public Optional<Pessoa> getPessoabyId(@PathVariable Integer id) {
		return PessoaService.findById(id);
	}
	@PostMapping
	public void saveClient(@RequestBody Pessoa pessoa) {
		PessoaService.save(pessoa);
	}

	@DeleteMapping(path = "/{id}")
	public void deletepessoa(@PathVariable Integer id) {
		PessoaService.deleteById(id);
	}

	@PutMapping("/{id}")
	public Pessoa update(@PathVariable Integer id, @RequestBody Pessoa pessoa) {
		Pessoa pessoaAtual = PessoaService.findById(id).get();
		BeanUtils.copyProperties(pessoa, pessoaAtual, "id");
		return PessoaService.update(pessoaAtual);
	}
}
