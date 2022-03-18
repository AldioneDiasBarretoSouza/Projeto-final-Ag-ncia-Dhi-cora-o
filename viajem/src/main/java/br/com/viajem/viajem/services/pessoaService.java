package br.com.viajem.viajem.services;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.viajem.viajem.model.Pessoa;
import br.com.viajem.viajem.repository.PessoaRepository;

@Service
public class pessoaService {

	@Autowired
	private PessoaRepository repository;

	public List<Pessoa> findAll() {
		return repository.findAll();
	}

	public Optional<Pessoa> findById(Integer id) {
		return repository.findById(id);
	}

	public void save(Pessoa pessoa) {
		repository.save(pessoa);
	}

	public Pessoa update(Pessoa pessoa) {

		return repository.save(pessoa);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

}
