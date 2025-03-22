package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.PosicoesCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.PosicoesDTO;
import arenaiq.dadoshistoricos.core.mappers.PosicaoMapper;
import arenaiq.dadoshistoricos.core.models.Posicoes;
import arenaiq.dadoshistoricos.core.services.PosicoesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/posicoes")
@RequiredArgsConstructor
public class PosicaoController {
  private final PosicaoMapper mapper;
  private final PosicoesService service;

  @PostMapping
  public ResponseEntity<PosicoesDTO> criar(@RequestBody PosicoesCreateDTO request){
    Posicoes m = mapper.map(request);
    m = service.salvar(m);
    PosicoesDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }
}
