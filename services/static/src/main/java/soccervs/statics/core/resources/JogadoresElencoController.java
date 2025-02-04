package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.mappers.JElencoMapper;
import soccervs.statics.core.services.JElencoService;



@RestController
@RequestMapping("/jogadores-elenco")
public class JogadoresElencoController {
	
	@Autowired
	private JElencoMapper mapper;
	
	@Autowired
	private JElencoService service;
	
	@PostMapping
	public void postMethodName(@RequestBody String entity) {
		
	}
	
	
	@GetMapping
	public void encontrarTodos() {
		
	}
	
}
