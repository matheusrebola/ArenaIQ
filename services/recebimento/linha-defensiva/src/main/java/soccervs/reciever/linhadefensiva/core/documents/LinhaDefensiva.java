package soccervs.reciever.linhadefensiva.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ldefensiva")
public class LinhaDefensiva {
	@Id
	private String id;
	private Float alturaMedia;
	private Float tempo;
	private Long partidaId;
	private Long timeId;

	public LinhaDefensiva(String id, Float alturaMedia, Float tempo, Long partidaId, Long timeId) {
		super();
		this.id = id;
		this.alturaMedia = alturaMedia;
		this.tempo = tempo;
		this.partidaId = partidaId;
		this.timeId = timeId;
	}

	public LinhaDefensiva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Float getAlturaMedia() {
		return alturaMedia;
	}

	public void setAlturaMedia(Float alturaMedia) {
		this.alturaMedia = alturaMedia;
	}

	public Float getTempo() {
		return tempo;
	}

	public void setTempo(Float tempo) {
		this.tempo = tempo;
	}

	public Long getPartidaId() {
		return partidaId;
	}

	public void setPartidaId(Long partidaId) {
		this.partidaId = partidaId;
	}

	public Long getTimeId() {
		return timeId;
	}

	public void setTimeId(Long timeId) {
		this.timeId = timeId;
	}

}
