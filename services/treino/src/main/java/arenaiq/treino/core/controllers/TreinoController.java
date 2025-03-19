package arenaiq.treino.core.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.treino.core.dtos.EventosCreateDTO;
import arenaiq.treino.core.dtos.EventosDTO;
import arenaiq.treino.core.dtos.FormacoesCreateDTO;
import arenaiq.treino.core.dtos.FormacoesDTO;
import arenaiq.treino.core.dtos.LinhaDefensivaCreateDTO;
import arenaiq.treino.core.dtos.LinhaDefensivaDTO;
import arenaiq.treino.core.mappers.TreinoMapper;
import arenaiq.treino.core.models.Eventos;
import arenaiq.treino.core.models.Formacoes;
import arenaiq.treino.core.models.LinhaDefensiva;
import arenaiq.treino.core.services.TreinoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/treino")
@RequiredArgsConstructor
public class TreinoController {
  private final TreinoMapper mapper;
  private final TreinoService service;

  @PostMapping("/eventos")
  public ResponseEntity<Eventos> criar(@RequestBody EventosCreateDTO dto){
    Eventos m = mapper.map(dto);
    Eventos s = service.salvar(m);
    return new ResponseEntity<>(s, HttpStatus.CREATED);
  }

  @PostMapping("/formacoes")
  public ResponseEntity<Formacoes> criar(@RequestBody FormacoesCreateDTO requestDTO){
    Formacoes m = mapper.map(requestDTO);
    Formacoes s = service.salvar(m);
    return new ResponseEntity<>(s, HttpStatus.CREATED);
  }

  @PostMapping("/linha-defensiva")
  public ResponseEntity<LinhaDefensiva> criar(@RequestBody LinhaDefensivaCreateDTO requestDTO){
    LinhaDefensiva m = mapper.map(requestDTO);
    LinhaDefensiva s = service.salvar(m);
    return new ResponseEntity<>(s, HttpStatus.CREATED);
  }

  @GetMapping("/eventos")
  public ResponseEntity<List<EventosDTO>> encontrarEventos() {
    List<EventosDTO> eventos = service.encontrarEventos().stream().map(mapper::map).collect(Collectors.toList());
    return ResponseEntity.ok(eventos);
}
  @GetMapping("/formacoes")
  public ResponseEntity<List<FormacoesDTO>> encontrarFormacoes(){
    List<FormacoesDTO> f = service.encontrarFormacoes().stream().map(mapper::map).collect(Collectors.toList());
    return ResponseEntity.ok(f);
  }

  @GetMapping("/linha-defensiva")
  public ResponseEntity<List<LinhaDefensivaDTO>> encontrarLinhas(){
    List<LinhaDefensivaDTO> l = service.encontrarLinhas().stream().map(mapper::map).collect(Collectors.toList());
    return ResponseEntity.ok(l);
  }
}
