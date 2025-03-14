package soccervs.reciever.movimentacao.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movimentacao")
public class Movimentacao {
	@Id
	private String id;
	private Short eixoX;
	private Short eixoY;
	private Float aceleracao;
	private Float desaceleracao;
	private Byte pressao;
	private Long jogadorId;
	private Long partidaId;

	public Movimentacao(String id, Short eixoX, Short eixoY, Float aceleracao, Float desaceleracao, Byte pressao,
			Long jogadorId, Long partidaId) {
		super();
		this.id = id;
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.aceleracao = aceleracao;
		this.desaceleracao = desaceleracao;
		this.pressao = pressao;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public Movimentacao() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Float getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(Float aceleracao) {
		this.aceleracao = aceleracao;
	}

	public Float getDesaceleracao() {
		return desaceleracao;
	}

	public void setDesaceleracao(Float desaceleracao) {
		this.desaceleracao = desaceleracao;
	}

	public Byte getPressao() {
		return pressao;
	}

	public void setPressao(Byte pressao) {
		this.pressao = pressao;
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
