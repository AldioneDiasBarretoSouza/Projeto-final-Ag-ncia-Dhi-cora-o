package br.com.viajem.viajem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.viajem.viajem.model.Pessoa;
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
