package soccervs.reciever.eventosespecificos.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.eventosespecificos.core.documents.EventosEspecificos;
import soccervs.reciever.eventosespecificos.core.services.EventosEspecificosService;

@RestController
@RequestMapping("/eventos-especificos")
public class EventosEspecificosController {

	private final EventosEspecificosService service;

	public EventosEspecificosController(EventosEspecificosService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<EventosEspecificos> criar(@RequestBody EventosEspecificos evento) {
		EventosEspecificos saved = service.salvar(evento);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@GetMapping
	public ResponseEntity<List<EventosEspecificos>> encontrartodos() {
		List<EventosEspecificos> eventos = service.encontrarTodos();
		return ResponseEntity.ok(eventos);
	}
}
