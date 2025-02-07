package soccervs.persistence.core.dtos;

import soccervs.persistence.core.entities.enums.EPasse;
import soccervs.persistence.core.entities.enums.EResultado;

public class PDetalhesCreateDTO {
	private Float tempo;
	private EPasse passe;
	private EResultado resultado;
	private Byte distancia;
	private Long jOrigemId;
	private Long jDestinoId;
	private Long partidaId;

	public PDetalhesCreateDTO(Float tempo, EPasse passe, EResultado resultado, Byte distancia, Long jOrigemId,
			Long jDestinoId, Long partidaId) {
		super();
		this.tempo = tempo;
		this.passe = passe;
		this.resultado = resultado;
		this.distancia = distancia;
		this.jOrigemId = jOrigemId;
		this.jDestinoId = jDestinoId;
		this.partidaId = partidaId;
	}

	public PDetalhesCreateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public EPasse getPasse() {
		return passe;
	}

	public void setPasse(EPasse passe) {
		this.passe = passe;
	}

	public EResultado getResultado() {
		return resultado;
	}

	public void setResultado(EResultado resultado) {
		this.resultado = resultado;
	}

	public Byte getDistancia() {
		return distancia;
	}

	public void setDistancia(Byte distancia) {
		this.distancia = distancia;
	}

	public Long getjOrigemId() {
		return jOrigemId;
	}

	public void setjOrigemId(Long jOrigemId) {
		this.jOrigemId = jOrigemId;
	}

	public Long getjDestinoId() {
		return jDestinoId;
	}

	public void setjDestinoId(Long jDestinoId) {
		this.jDestinoId = jDestinoId;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

}
