package soccervs.reciever.passes.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.passes.core.documents.PassesDetalhes;
import soccervs.reciever.passes.core.services.PassesDetalhesService;

@RestController
@RequestMapping("/passes-detalhes")
public class PassesDetalhesController {

	private final PassesDetalhesService service;

	public PassesDetalhesController(PassesDetalhesService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<PassesDetalhes> criar(@RequestBody PassesDetalhes passesDetalhes) {
		PassesDetalhes saved = service.salvar(passesDetalhes);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@GetMapping
	public ResponseEntity<List<PassesDetalhes>> encontrartodos() {
		List<PassesDetalhes> passes = service.encontrarTodos();
		return ResponseEntity.ok(passes);
	}
}
