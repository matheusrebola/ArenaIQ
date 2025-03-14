package soccervs.reciever.relacaojogadores.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.relacaojogadores.core.documents.RelacaoJogadores;
import soccervs.reciever.relacaojogadores.core.services.RelacaoJogadoresService;

@RestController
@RequestMapping("/relacao-jogadores")
public class RelacaoJogadoresController {

	private final RelacaoJogadoresService service;

	public RelacaoJogadoresController(RelacaoJogadoresService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<RelacaoJogadores> criar(@RequestBody RelacaoJogadores relacao) {
		RelacaoJogadores saved = service.salvar(relacao);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@GetMapping
	public ResponseEntity<List<RelacaoJogadores>> encontrartodos() {
		List<RelacaoJogadores> relacao = service.encontrarTodos();
		return ResponseEntity.ok(relacao);
	}
}
