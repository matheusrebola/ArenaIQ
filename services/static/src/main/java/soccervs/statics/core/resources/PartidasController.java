package soccervs.statics.core.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soccervs.statics.core.dtos.PartidaCreateDTO;
import soccervs.statics.core.entities.Partidas;
import soccervs.statics.core.mappers.PartidasMapper;
import soccervs.statics.core.services.PartidasService;


@RestController
@RequestMapping("/partidas")
public class PartidasController {

	@Autowired
	private PartidasMapper mapper;

	@Autowired
	private PartidasService service;
	
	@PostMapping
	public void cadastrarPartida(@RequestBody PartidaCreateDTO createDTO) {
		Partidas partida = mapper.map(createDTO);
	}
	
}
