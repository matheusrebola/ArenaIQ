package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.CompeticoesCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.CompeticoesDTO;
import arenaiq.dadoshistoricos.core.mappers.CompeticaoMapper;
import arenaiq.dadoshistoricos.core.models.Competicoes;
import arenaiq.dadoshistoricos.core.services.CompeticoesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/competicoes")
@RequiredArgsConstructor
public class CompeticaoController {
  private final CompeticaoMapper mapper;
  private final CompeticoesService service;

  @PostMapping
  public ResponseEntity<CompeticoesDTO> criar(@RequestBody CompeticoesCreateDTO request){
    Competicoes m = mapper.map(request);
    Competicoes s = service.salvar(m);
    CompeticoesDTO dto = mapper.map(s);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }
}
