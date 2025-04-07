package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.PartidasCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.PartidasDTO;
import arenaiq.dadoshistoricos.core.mappers.PartidasMapper;
import arenaiq.dadoshistoricos.core.models.Partidas;
import arenaiq.dadoshistoricos.core.services.PartidasService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/partidas")
@RequiredArgsConstructor
public class PartidasController {
  private final PartidasMapper mapper;
  private final PartidasService service;

  @PostMapping
  public ResponseEntity<PartidasDTO> criar(@RequestBody PartidasCreateDTO request){
    Partidas m = mapper.map(request);
    m = service.salvar(m);
    PartidasDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }
}
