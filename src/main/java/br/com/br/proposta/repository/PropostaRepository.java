package br.com.br.proposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.br.proposta.model.Proposta;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {

}
