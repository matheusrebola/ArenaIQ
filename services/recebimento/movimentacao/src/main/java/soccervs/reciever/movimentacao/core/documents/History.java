package soccervs.reciever.movimentacao.core.documents;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import soccervs.reciever.movimentacao.core.documents.enums.ESagaStatus;

@Document(collection = "history")
public class History {
	private String source;
	private ESagaStatus status;
	private String message;
	private LocalDateTime createdAt;

	public History(String source, ESagaStatus status, String message, LocalDateTime createdAt) {
		super();
		this.source = source;
		this.status = status;
		this.message = message;
		this.createdAt = createdAt;
	}

	public History() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public ESagaStatus getStatus() {
		return status;
	}

	public void setStatus(ESagaStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}
