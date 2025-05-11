package arenaiq.recebidor.partida.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.recebidor.partida.core.dtos.PartidaUpdateDTO;
import arenaiq.recebidor.partida.core.dtos.PartidasDTO;
import arenaiq.recebidor.partida.core.mappers.PartidaMapper;
import arenaiq.recebidor.partida.core.models.Partidas;
import arenaiq.recebidor.partida.core.services.PartidaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/partidas")
@RequiredArgsConstructor
public class PartidaController {
  private final PartidaMapper pMapper;
  private final PartidaService pService;

  @PutMapping("/{id}")
  public ResponseEntity<PartidasDTO> atualizarPartida(@RequestBody PartidaUpdateDTO dto, @PathVariable String id){
    Partidas p = pService.encontrarPeloId(id);
    if (p == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Partidas s = pService.atualizarPartida(p, dto);
    PartidasDTO r = pMapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.OK);
  } 
}
