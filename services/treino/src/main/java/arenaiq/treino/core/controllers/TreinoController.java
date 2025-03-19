package arenaiq.treino.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.treino.core.dtos.EventosDTO;
import arenaiq.treino.core.dtos.FormacoesDTO;
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
  public ResponseEntity<Eventos> criar(@RequestBody EventosDTO dto){
    Eventos m = mapper.map(dto);
    Eventos s = service.salvar(m);
    return new ResponseEntity<>(s, HttpStatus.CREATED);
  }

  @PostMapping("/formacoes")
  public ResponseEntity<Formacoes> criar(@RequestBody FormacoesDTO requestDTO){
    Formacoes m = mapper.map(requestDTO);
    Formacoes s = service.salvar(m);
    return new ResponseEntity<>(s, HttpStatus.CREATED);
  }

  @PostMapping("/linha-defensiva")
  public ResponseEntity<LinhaDefensiva> criar(@RequestBody LinhaDefensivaDTO requestDTO){
    LinhaDefensiva m = mapper.map(requestDTO);
    LinhaDefensiva s = service.salvar(m);
    return new ResponseEntity<>(s, HttpStatus.CREATED);
  }
}
