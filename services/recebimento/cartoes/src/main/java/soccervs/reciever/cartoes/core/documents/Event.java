package soccervs.reciever.cartoes.core.documents;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import soccervs.reciever.cartoes.core.documents.enums.ESagaStatus;

@Document(collection = "event")
public class Event {
	@Id
	private String id;
	private String transactionId;
	private String cartaoId;
	private String source;
	private ESagaStatus status;
	@DBRef
	private List<History> eventHistory;
	private LocalDateTime createdAt;

	public Event(String id, String transactionId, String cartaoId, String source, ESagaStatus status,
			List<History> eventHistory, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.transactionId = transactionId;
		this.cartaoId = cartaoId;
		this.source = source;
		this.status = status;
		this.eventHistory = eventHistory;
		this.createdAt = createdAt;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getCartaoId() {
		return cartaoId;
	}

	public void setCartaoId(String cartaoId) {
		this.cartaoId = cartaoId;
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

	public List<History> getEventHistory() {
		return eventHistory;
	}

	public void setEventHistory(List<History> eventHistory) {
		this.eventHistory = eventHistory;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void addToHistory(History history) {
		
		eventHistory.add(history);
	}

}
