package arenaiq.persistencia.evento.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.persistencia.evento.core.dtos.EventosDTO;
import arenaiq.persistencia.evento.core.mappers.EventosMapper;
import arenaiq.persistencia.evento.core.models.Eventos;
import arenaiq.persistencia.evento.core.services.EventosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/eventos")
@RequiredArgsConstructor
public class EventosController {
  private final EventosService s;
  private final EventosMapper m;

  @GetMapping
  public ResponseEntity<List<EventosDTO>> encontrarTodos(){
    List<Eventos> e = s.encontrarTodos();
    List<EventosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<EventosDTO> cadastrar(@RequestBody EventosDTO dto){
    Eventos e = m.map(dto);
    Eventos ev = s.salvar(e);
    EventosDTO r = m.map(ev);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }
}
