package br.com.viajem.viajem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.viajem.viajem.model.Promocao;

public interface PromocaoRepository extends JpaRepository<Promocao, Integer> {
}
