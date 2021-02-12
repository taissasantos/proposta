package br.com.br.proposta.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Cards {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @NotBlank
    private String titular;

    private String identificadorCartao;

    @OneToOne
    private Proposta proposta;

	@Deprecated
	public Cards() {}

	public Cards(@NotBlank String titular, String identificadorCartao, Proposta proposta) {
		super();
		this.titular = titular;
		this.identificadorCartao = identificadorCartao;
		this.proposta = proposta;
	}

	public Long getId() {
		return id;
	}

	public String getTitular() {
		return titular;
	}

	public String getIdentificadorCartao() {
		return identificadorCartao;
	}

	public Proposta getProposta() {
		return proposta;
	}

	
}
