package soccervs.reciever.linhadefensiva.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.linhadefensiva.core.documents.LinhaDefensiva;
import soccervs.reciever.linhadefensiva.core.services.LinhaDefensivaService;

@RestController
@RequestMapping("/linha-defensiva")
public class LinhaDefensivaController {

	private final LinhaDefensivaService service;

	public LinhaDefensivaController(LinhaDefensivaService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<LinhaDefensiva> criar(@RequestBody LinhaDefensiva linhaDefensiva) {
		LinhaDefensiva saved = service.salvar(linhaDefensiva);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@GetMapping
	public ResponseEntity<List<LinhaDefensiva>> encontrartodos() {
		List<LinhaDefensiva> linha = service.encontrarTodos();
		return ResponseEntity.ok(linha);
	}
}
