package soccervs.statics.core.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.ResultadoCreateDTO;
import soccervs.statics.core.dtos.ResultadoDTO;
import soccervs.statics.core.entities.Resultados;
import soccervs.statics.core.mappers.ResultadosMapper;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.ResultadosService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/resultados")
public class ResultadosController {

	@Autowired
	private ResultadosMapper mapper;
	
	private ResultadosService service;
	
	@PostMapping
	public ResponseEntity<ResultadoDTO> cadastrarResultado(@RequestBody ResultadoCreateDTO createDTO) {
		Resultados resultado = mapper.map(createDTO);
		Resultados saved = service.salvar(resultado);
		
		if (saved == null) {
			throw new NotPersistedException("Resultado não persistido");
		}
		
		Long id = service.pegarId(saved);
		URI location = URI.create("/resultados/"+id);
		ResultadoDTO dto = mapper.map(saved);
		
		return ResponseEntity.created(location).body(dto);
	}
	
}
