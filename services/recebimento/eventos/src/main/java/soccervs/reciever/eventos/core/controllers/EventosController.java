package soccervs.reciever.eventos.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.eventos.core.documents.Eventos;
import soccervs.reciever.eventos.core.services.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventosController {

	private final EventoService service;

	public EventosController(EventoService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Eventos> criar(@RequestBody Eventos evento) {
		Eventos saved = service.createEvento(evento);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@GetMapping
	public ResponseEntity<List<Eventos>> encontrartodos() {
		List<Eventos> eventos = service.encontrarTodos();
		return ResponseEntity.ok(eventos);
	}
}
