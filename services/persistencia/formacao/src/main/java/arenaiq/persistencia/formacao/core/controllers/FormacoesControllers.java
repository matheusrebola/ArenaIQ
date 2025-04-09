package arenaiq.persistencia.formacao.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.persistencia.formacao.core.dtos.FormacoesDTO;
import arenaiq.persistencia.formacao.core.mappers.FormacoesMapper;
import arenaiq.persistencia.formacao.core.models.Formacoes;
import arenaiq.persistencia.formacao.core.services.FormacoesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/formacoes")
@RequiredArgsConstructor
public class FormacoesControllers {
  private final FormacoesService s;
  private final FormacoesMapper m;

  @GetMapping
  public ResponseEntity<List<FormacoesDTO>> encontrarTodos(){
    List<Formacoes> f = s.encontrarTodos();
    List<FormacoesDTO> dto = m.map(f);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
