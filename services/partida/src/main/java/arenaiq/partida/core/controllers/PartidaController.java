package arenaiq.partida.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.partida.core.dtos.PartidaDTO;
import arenaiq.partida.core.mappers.PartidaMapper;
import arenaiq.partida.core.models.Partida;
import arenaiq.partida.core.services.PartidaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/partidas")
@RequiredArgsConstructor
public class PartidaController {
  private final PartidaMapper mapper;
  private final PartidaService service;

  public ResponseEntity<Partida> criar(@RequestBody PartidaDTO requestDTO){
    Partida p = mapper.map(requestDTO);
    Partida s = service.salvar(p);
    return new ResponseEntity<>(s, HttpStatus.CREATED);
  }
}
