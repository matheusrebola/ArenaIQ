package soccervs.reciever.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import soccervs.reciever.core.documents.enums.EEventoEspecifico;

@Document(collection = "eventos_especificos")
public class EventosEspecificos {
	@Id
	private Long id;
	private EEventoEspecifico evento;
	private Byte minuto;
	private Long partidaId;
	private Long jogadorId;

	public EventosEspecificos(Long id, EEventoEspecifico evento, Byte minuto, Long partidaId, Long jogadorId) {
		super();
		this.id = id;
		this.evento = evento;
		this.minuto = minuto;
		this.partidaId = partidaId;
		this.jogadorId = jogadorId;
	}

	public EventosEspecificos() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EEventoEspecifico getEvento() {
		return evento;
	}

	public void setEvento(EEventoEspecifico evento) {
		this.evento = evento;
	}

	public Byte getMinuto() {
		return minuto;
	}

	public void setMinuto(Byte minuto) {
		this.minuto = minuto;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

	public Long getJogadorId() {
		return jogadorId;
	}

	public void setJogadorId(Long jogadorId) {
		this.jogadorId = jogadorId;
	}

}
