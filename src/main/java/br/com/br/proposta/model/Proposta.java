package br.com.br.proposta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
public class Proposta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long	id;
	
	@NotBlank
	public String documento;
	
	@NotBlank
	@Email
	@Column(nullable = false)
	public String email;
	
	@NotBlank
	@Column(nullable = false)
	public String nome;
	
	@NotBlank
	@Column(nullable = false)
	public String endereco;
	
	@Positive
	@Column(nullable = false)
	public Double salario;
	
	public Proposta() {}

	public Proposta(@NotBlank String documento, @NotBlank @Email String email, @NotBlank String nome,
			@NotBlank String endereco, @Positive @NotBlank Double salario) {
		this.documento = documento;
		this.email = email;
		this.nome = nome;
		this.endereco = endereco;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public String getDocumento() {
		return documento;
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public Double getSalario() {
		return salario;
	}
	
	

}
