package soccervs.reciever.eventosespecificos.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import soccervs.reciever.eventosespecificos.core.documents.EventosEspecificos;
import soccervs.reciever.eventosespecificos.core.repositories.EventosEspecificosRepository;

@Service
public class EventosEspecificosService {
	
	private final EventosEspecificosRepository repository;
	
	public EventosEspecificosService(EventosEspecificosRepository repository) {
		super();
		this.repository = repository;
	}

	public EventosEspecificos salvar(EventosEspecificos evento) {
		return repository.save(evento);
	}

	public List<EventosEspecificos> encontrarTodos() {
		return repository.findAll();
	}

}
