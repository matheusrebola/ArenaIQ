package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.MovimentacoesDTO;
import arenaiq.consulta.core.mappers.MovimentacaoMapper;
import arenaiq.consulta.core.models.Movimentacoes;
import arenaiq.consulta.core.services.MovimentacaoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/movimentacoes")
@RequiredArgsConstructor
public class MovimentacoesController {
  private final MovimentacaoService s;
  private final MovimentacaoMapper m;

  @GetMapping
  public ResponseEntity<List<MovimentacoesDTO>> findAll(){
    List<Movimentacoes> find = s.findAll();
    List<MovimentacoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
