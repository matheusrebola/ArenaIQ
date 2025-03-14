package soccervs.reciever.cartoes.core.services;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import soccervs.reciever.cartoes.core.documents.Event;
import soccervs.reciever.cartoes.core.documents.History;
import soccervs.reciever.cartoes.core.documents.enums.ESagaStatus;
import soccervs.reciever.cartoes.core.repositories.EventRepository;

@Service
public class EventService {
	private static final String CURRENT_SOURCE = "CARTOES_SERVICE";

	private final EventRepository repository;
	

	public EventService(EventRepository repository) {
		super();
		this.repository = repository;
	}

	public void notifyEnding(Event event) {
		event.setSource(CURRENT_SOURCE);
		event.setCartaoId(event.getCartaoId());
		event.setCreatedAt(LocalDateTime.now());
		setEndingHistory(event);
		save(event);
	}

	void setEndingHistory(Event event) {
		if (ESagaStatus.SUCCESS.equals(event.getStatus())) {
			addHistory(event, "Saga finished successfully!");
		} else {
			addHistory(event, "Saga finished with errors!");
		}
	}

	public Event save(Event event) {
		return repository.save(event);
	}

	public Event createEvent(String cartaoId) {
		Event event = new Event();
		event.setSource(CURRENT_SOURCE);
		event.setStatus(ESagaStatus.SUCCESS);
		event.setCartaoId(cartaoId);
		event.setTransactionId(UUID.randomUUID().toString());
		event.setCreatedAt(LocalDateTime.now());
		//addHistory(event, "Saga started!");
		return save(event);
	}

	void addHistory(Event event, String message) {
		var history = new History();
		history.setSource(event.getSource());
		history.setStatus(event.getStatus());
		history.setMessage(message);
		history.setCreatedAt(LocalDateTime.now());
		event.addToHistory(history);
	}
}
