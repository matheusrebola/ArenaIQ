package soccervs.reciever.movimentacao.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.movimentacao.core.documents.Movimentacao;
import soccervs.reciever.movimentacao.core.services.MovimentacaoService;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

	private final MovimentacaoService service;

	public MovimentacaoController(MovimentacaoService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Movimentacao> criar(@RequestBody Movimentacao movimentacao) {
		Movimentacao saved = service.salvar(movimentacao);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@GetMapping
	public ResponseEntity<List<Movimentacao>> encontrartodos() {
		List<Movimentacao> movimentacoes = service.encontrarTodos();
		return ResponseEntity.ok(movimentacoes);
	}
}
