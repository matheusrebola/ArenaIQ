package soccervs.reciever.cartoes.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import soccervs.reciever.cartoes.core.documents.enums.ECartao;

@Document(collection = "cartoes")
public class Cartoes {
	@Id
	private String id;
	private Byte minuto;
	private ECartao cartao;
	private String motivo;
	private Long jogadorId;
	private Long partidaId;

	public Cartoes(String id, Byte minuto, ECartao cartao, String motivo, Long jogadorId, Long partidaId) {
		super();
		this.id = id;
		this.minuto = minuto;
		this.cartao = cartao;
		this.motivo = motivo;
		this.jogadorId = jogadorId;
		this.partidaId = partidaId;
	}

	public Cartoes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Byte getMinuto() {
		return minuto;
	}

	public void setMinuto(Byte minuto) {
		this.minuto = minuto;
	}

	public ECartao getCartao() {
		return cartao;
	}

	public void setCartao(ECartao cartao) {
		this.cartao = cartao;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
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
