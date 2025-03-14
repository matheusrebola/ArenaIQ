package soccervs.reciever.faltas.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.faltas.core.documents.Faltas;
import soccervs.reciever.faltas.core.services.FaltasService;

@RestController
@RequestMapping("/faltas")
public class FaltasController {

	private final FaltasService service;

	public FaltasController(FaltasService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Faltas> criar(@RequestBody Faltas falta) {
		Faltas saved = service.salvar(falta);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@GetMapping
	public ResponseEntity<List<Faltas>> encontrartodos() {
		List<Faltas> faltas = service.encontrarTodos();
		return ResponseEntity.ok(faltas);
	}
}
