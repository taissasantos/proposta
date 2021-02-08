package br.com.br.proposta.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.br.proposta.model.Proposta;
import br.com.br.proposta.repository.PropostaRepository;
import br.com.br.proposta.request.NovaPropostaRequest;

@RestController
public class NovaPropostaController {
	
	@Autowired
	PropostaRepository repository;

	@PostMapping(value ="/api/proposta")
	public ResponseEntity<?>novaProposta(@RequestBody @Valid NovaPropostaRequest request, 
			UriComponentsBuilder uri){
		Proposta proposta = request.toModel();
		repository.save(proposta);
		
		URI location = uri.path("/api/proposta/{id}")
				.buildAndExpand(proposta.getId()).toUri();
		
		return ResponseEntity.created(location).build();
		
		
	}
}
