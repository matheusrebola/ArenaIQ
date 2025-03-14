package soccervs.reciever.formacao.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import soccervs.reciever.formacao.core.documents.enums.EFormacao;

@Document(collection = "formacao")
public class FormacaoTime {
	@Id
	private String id;
	private Float minuto;
	private EFormacao formacao;
	private Long partidaId;

	public FormacaoTime(String id, Float minuto, EFormacao formacao, Long jogadorId, Long partidaId) {
		super();
		this.id = id;
		this.minuto = minuto;
		this.formacao = formacao;
		this.partidaId = partidaId;
	}

	public FormacaoTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Float getMinuto() {
		return minuto;
	}

	public void setMinuto(Float minuto) {
		this.minuto = minuto;
	}

	public EFormacao getFormacao() {
		return formacao;
	}

	public void setFormacao(EFormacao formacao) {
		this.formacao = formacao;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

}
