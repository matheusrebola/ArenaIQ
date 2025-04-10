package arenaiq.treino.core.controllers;

import java.util.List;

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
import arenaiq.treino.core.dtos.LinhasCreateDTO;
import arenaiq.treino.core.dtos.LinhasDTO;
import arenaiq.treino.core.dtos.MovimentacoesCreateDTO;
import arenaiq.treino.core.dtos.MovimentacoesDTO;
import arenaiq.treino.core.mappers.TreinoMapper;
import arenaiq.treino.core.models.Eventos;
import arenaiq.treino.core.models.Formacoes;
import arenaiq.treino.core.models.Linhas;
import arenaiq.treino.core.models.Movimentacoes;
import arenaiq.treino.core.services.TreinoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/treino")
@RequiredArgsConstructor
public class TreinoController {
  private final TreinoMapper mapper;
  private final TreinoService service;

  @PostMapping("/eventos")
  public ResponseEntity<EventosDTO> criar(@RequestBody EventosCreateDTO dto){
    Eventos m = mapper.map(dto);
    Eventos s = service.salvar(m);
    EventosDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }

  @PostMapping("/formacoes")
  public ResponseEntity<FormacoesDTO> criar(@RequestBody FormacoesCreateDTO dto){
    Formacoes m = mapper.map(dto);
    Formacoes s = service.salvar(m);
    FormacoesDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }

  @PostMapping("/linhas")
  public ResponseEntity<LinhasDTO> criar(@RequestBody LinhasCreateDTO dto){
    Linhas m = mapper.map(dto);
    Linhas s = service.salvar(m);
    LinhasDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }

  @PostMapping("/movimentacoes")
  public ResponseEntity<MovimentacoesDTO> criar(@RequestBody MovimentacoesCreateDTO dto){
    Movimentacoes m = mapper.map(dto);
    Movimentacoes s = service.salvar(m);
    MovimentacoesDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }

  @GetMapping("/eventos")
  public ResponseEntity<List<EventosDTO>> encontrarEventos() {
    List<Eventos> eventos = service.encontrarEventos();
    List<EventosDTO> r = mapper.mapEventos(eventos);
    return ResponseEntity.ok(r);
}
  @GetMapping("/formacoes")
  public ResponseEntity<List<FormacoesDTO>> encontrarFormacoes(){
    List<Formacoes> f = service.encontrarFormacoes();
    List<FormacoesDTO> r = mapper.mapFormacoes(f);
    return ResponseEntity.ok(r);
  }

  @GetMapping("/linhas")
  public ResponseEntity<List<LinhasDTO>> encontrarLinhas(){
    List<Linhas> l = service.encontrarLinhas();
    List<LinhasDTO> r = mapper.mapLinhas(l);
    return ResponseEntity.ok(r);
  }

  @GetMapping("/movimentacoes")
  public ResponseEntity<List<MovimentacoesDTO>> encontrarMovimentacoes(){
    List<Movimentacoes> m = service.encontrarMovimentacoes();
    List<MovimentacoesDTO> dto = mapper.mapMoimentacoes(m);
    return ResponseEntity.ok(dto);
  }
}
