package soccervs.reciever.eventos.core.services;

import java.time.LocalDateTime;
import java.util.UUID;

import soccervs.reciever.eventos.core.documents.Event;
import soccervs.reciever.eventos.core.documents.History;
import soccervs.reciever.eventos.core.documents.enums.ESagaStatus;
import soccervs.reciever.eventos.core.repositories.EventosRepository;

public class EventService {
	
	private static final String CURRENT_SOURCE = "EVENTOS_SERVICE";
	private final EventosRepository repository;

	public EventService(EventosRepository repository) {
		super();
		this.repository = repository;
	}

	public void notifyEnding(Event event) {
		event.setSource(CURRENT_SOURCE);
		event.setEventoId(event.getEventoId());
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
		event.setEventoId(cartaoId);
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
