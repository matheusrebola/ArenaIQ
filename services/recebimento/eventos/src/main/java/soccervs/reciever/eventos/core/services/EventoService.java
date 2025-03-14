package soccervs.reciever.eventos.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.eventos.core.documents.Eventos;
import soccervs.reciever.eventos.core.producer.EventosProducer;
import soccervs.reciever.eventos.core.repositories.EventosRepository;
import soccervs.reciever.eventos.core.utils.JsonUtil;

@Service
public class EventoService {
	private final EventosRepository repository;
	private final EventService eventService;
	private final EventosProducer producer;
	private final JsonUtil jsonUtil;

	public EventoService(EventosRepository repository, EventService eventService, EventosProducer producer,
			JsonUtil jsonUtil) {
		super();
		this.repository = repository;
		this.eventService = eventService;
		this.producer = producer;
		this.jsonUtil = jsonUtil;
	}
	
	public Eventos createEvento(Eventos evento) {
		var saved = salvar(evento);
		String eventoId = saved.getId();
		producer.sendEvent(jsonUtil.toJson(eventService.createEvent(eventoId)));
		return saved;
	}

	public Eventos salvar(Eventos evento) {
		return repository.save(evento);
	}

	public List<Eventos> encontrarTodos() {
		return repository.findAll();
	}


}
