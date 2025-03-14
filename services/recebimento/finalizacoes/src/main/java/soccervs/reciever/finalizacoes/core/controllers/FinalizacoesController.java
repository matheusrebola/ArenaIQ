package soccervs.reciever.finalizacoes.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.finalizacoes.core.documents.Finalizacoes;
import soccervs.reciever.finalizacoes.core.services.FinalizacoesService;

@RestController
@RequestMapping("/finalizacoes")
public class FinalizacoesController {

	private final FinalizacoesService service;

	public FinalizacoesController(FinalizacoesService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Finalizacoes> criar(@RequestBody Finalizacoes finalizacoes) {
		Finalizacoes saved = service.salvar(finalizacoes);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@GetMapping
	public ResponseEntity<List<Finalizacoes>> encontrartodos() {
		List<Finalizacoes> finalizacoes = service.encontrarTodos();
		return ResponseEntity.ok(finalizacoes);
	}
}
