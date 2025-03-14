package soccervs.reciever.cartoes.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.reciever.cartoes.core.documents.Cartoes;
import soccervs.reciever.cartoes.core.services.CartaoService;

@RestController
@RequestMapping("/cartoes")
public class CartoesController {

	private final CartaoService service;

	public CartoesController(CartaoService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Cartoes> criar(@RequestBody Cartoes cartao) {
		Cartoes saved = service.createCartao(cartao);
		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@GetMapping
	public ResponseEntity<List<Cartoes>> encontrarTodos() {
		List<Cartoes> cartoes = service.encotrarTodos();
		return ResponseEntity.ok(cartoes);
	}

}
