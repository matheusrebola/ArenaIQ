package soccervs.statics.core.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.PosicaoCreateDTO;
import soccervs.statics.core.dtos.PosicaoDTO;
import soccervs.statics.core.entities.Posicoes;
import soccervs.statics.core.mappers.PosicoesMapper;
import soccervs.statics.core.resources.exceptions.NotPersistedException;
import soccervs.statics.core.services.PosicoesService;

@RestController
@RequestMapping("/partidas")
public class PosicoesController {

	@Autowired
	private PosicoesMapper mapper;
	
	@Autowired
	private PosicoesService service;
	
	@PostMapping
	public ResponseEntity<PosicaoDTO> cadastrarPosicao(@RequestBody PosicaoCreateDTO createDTO) {
		Posicoes posicao = mapper.map(createDTO);
		Posicoes saved = service.save(posicao);
		
		if (saved == null) {
			throw new NotPersistedException("Posicao não persistida");
		}
		
		Byte id = service.pegarId(saved);
		URI location = URI.create("/posicoes/"+id);
		PosicaoDTO dto = mapper.map(saved);
		
		return ResponseEntity.created(location).body(dto);
	}
	
}
