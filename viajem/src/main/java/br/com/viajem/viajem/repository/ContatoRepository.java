package br.com.viajem.viajem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.viajem.viajem.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
