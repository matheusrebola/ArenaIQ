package soccervs.persistence.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import soccervs.persistence.core.entities.enums.EFinalizacao;
import soccervs.persistence.core.entities.enums.EResultado;

@Entity
@Table(name="tb_finalizacoes")
public class Finalizacoes {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Float tempo;
	@Enumerated(EnumType.STRING)
	private EFinalizacao finalizacao;
	@Enumerated(EnumType.STRING)
	private EResultado resultado;
	private Short eixoX;
	private Short eixoY;
	private Float expectativaGol;
	private Long jogadorId;
	private Long partidaId;

	public Finalizacoes(Long id, Float tempo, EFinalizacao finalizacao, EResultado resultado, Short eixoX, Short eixoY,
			Float expectativaGol, Long jogadorId, Long partidaId) {
		super();
		this.id = id;
		this.tempo = tempo;
		this.finalizacao = finalizacao;
		this.resultado = resultado;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.expectativaGol = expectativaGol;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public Finalizacoes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public EFinalizacao getFinalizacao() {
		return finalizacao;
	}

	public void setFinalizacao(EFinalizacao finalizacao) {
		this.finalizacao = finalizacao;
	}

	public EResultado getResultado() {
		return resultado;
	}

	public void setResultado(EResultado resultado) {
		this.resultado = resultado;
	}

	public Short getEixoX() {
		return eixoX;
	}

	public void setEixoX(Short eixoX) {
		this.eixoX = eixoX;
	}

	public Short getEixoY() {
		return eixoY;
	}

	public void setEixoY(Short eixoY) {
		this.eixoY = eixoY;
	}

	public Float getExpectativaGol() {
		return expectativaGol;
	}

	public void setExpectativaGol(Float expectativaGol) {
		this.expectativaGol = expectativaGol;
	}

	public Long getJogadorId() {
		return jogadorId;
	}

	public void setJogadorId(Long jogadorId) {
		this.jogadorId = jogadorId;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

}
