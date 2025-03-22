package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.TecnicosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.TecnicosDTO;
import arenaiq.dadoshistoricos.core.mappers.TecnicoMapper;
import arenaiq.dadoshistoricos.core.models.Tecnicos;
import arenaiq.dadoshistoricos.core.services.TecnicosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/tecnicos")
@RequiredArgsConstructor
public class TecnicoController {
  private final TecnicoMapper mapper;
  private final TecnicosService service;

  @PostMapping
  public ResponseEntity<TecnicosDTO> criar(@RequestBody TecnicosCreateDTO request){
    Tecnicos m = mapper.map(request);
    m = service.salvar(m);
    TecnicosDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }
}
