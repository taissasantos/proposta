package br.com.br.proposta.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.br.proposta.model.Proposta;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {
	
	public Optional<Proposta> findById(Long id);

	public Optional<Proposta> findByDocumento(String documento);
	 

}
