package arenaiq.persistencia.movimentacao.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.persistencia.movimentacao.core.dtos.MovimentacoesDTO;
import arenaiq.persistencia.movimentacao.core.mappers.MovimentacoesMapper;
import arenaiq.persistencia.movimentacao.core.models.Movimentacoes;
import arenaiq.persistencia.movimentacao.core.services.MovimentacoesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/movimentacoes")
@RequiredArgsConstructor
public class MovimentacoesController {
  private final MovimentacoesService s;
  private final MovimentacoesMapper m;

  @GetMapping
  public ResponseEntity<List<MovimentacoesDTO>> encontrarTodos(){
    List<Movimentacoes> mov = s.encontrarTodos();
    List<MovimentacoesDTO> dto = m.map(mov);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
