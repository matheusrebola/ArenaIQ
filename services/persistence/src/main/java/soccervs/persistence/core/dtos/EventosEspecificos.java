package soccervs.persistence.core.dtos;

import soccervs.persistence.core.entities.enums.EEventoEspecifico;

public class EventosEspecificos {
	private EEventoEspecifico evento;
	private Byte minuto;
	private Long partidaId;
	private Long jogadorId;

	public EventosEspecificos(EEventoEspecifico evento, Byte minuto, Long partidaId, Long jogadorId) {
		super();
		this.evento = evento;
		this.minuto = minuto;
		this.partidaId = partidaId;
		this.jogadorId = jogadorId;
	}

	public EventosEspecificos() {
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
