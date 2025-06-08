package arenaiq.encaminhador.evento.core.controllers;

import arenaiq.encaminhador.evento.core.dtos.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.encaminhador.evento.core.dtos.EventoDTO;
import arenaiq.encaminhador.evento.core.mappers.EventosMapper;
import arenaiq.encaminhador.evento.core.services.EventosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/eventos")
@RequiredArgsConstructor
public class EventosController {
  private final EventosMapper mapper;
  private final EventosService service;

  @PostMapping
  public ResponseEntity<ResponseDTO> criar(@RequestBody EventoDTO dto){
    try {
      service.criarEvento(dto);
      return new ResponseEntity<>(mapper.map(), HttpStatus.OK);
    } catch (RuntimeException e) {
      service.salvar(mapper.map(dto));
      throw new RuntimeException(e);
    }
  }
}
