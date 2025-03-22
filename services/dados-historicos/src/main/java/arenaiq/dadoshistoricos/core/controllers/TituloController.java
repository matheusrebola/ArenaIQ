package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.TitulosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.TitulosDTO;
import arenaiq.dadoshistoricos.core.mappers.TituloMapper;
import arenaiq.dadoshistoricos.core.models.Titulos;
import arenaiq.dadoshistoricos.core.services.TitulosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/titulos")
@RequiredArgsConstructor
public class TituloController {
  private final TituloMapper mapper;
  private final TitulosService service;

  @PostMapping
  public ResponseEntity<TitulosDTO> criar(@RequestBody TitulosCreateDTO request){
    Titulos m = mapper.map(request);
    m = service.salvar(m);
    TitulosDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }
}
