package soccervs.reciever.passes.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import soccervs.reciever.passes.core.documents.enums.EPasse;
import soccervs.reciever.passes.core.documents.enums.EResultado;

@Document(collection = "passes")
public class PassesDetalhes {
	@Id
	private String id;
	private Float tempo;
	private EPasse passe;
	private EResultado resultado;
	private Byte distancia;
	private Long jOrigemId;
	private Long jDestinoId;
	private Long partidaId;

	public PassesDetalhes(String id, Float tempo, EPasse passe, EResultado resultado, Byte distancia, Long jOrigemId,
			Long jDestinoId, Long partidaId) {
		super();
		this.id = id;
		this.tempo = tempo;
		this.passe = passe;
		this.resultado = resultado;
		this.distancia = distancia;
		this.jOrigemId = jOrigemId;
		this.jDestinoId = jDestinoId;
		this.partidaId = partidaId;
	}

	public PassesDetalhes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
