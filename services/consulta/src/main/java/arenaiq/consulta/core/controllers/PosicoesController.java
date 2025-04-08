package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.PosicoesDTO;
import arenaiq.consulta.core.mappers.PosicoesMapper;
import arenaiq.consulta.core.models.Posicoes;
import arenaiq.consulta.core.models.enums.EFunPosicao;
import arenaiq.consulta.core.models.enums.EPosicao;
import arenaiq.consulta.core.services.PosicoesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/posicoes")
@RequiredArgsConstructor
public class PosicoesController {
  private final PosicoesService s;
  private final PosicoesMapper m;

  @GetMapping("/{posicao}")
  public ResponseEntity<List<PosicoesDTO>> findByPosicao(@PathVariable EPosicao p){
    List<Posicoes> find = s.findByPosicao(p);
    List<PosicoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/funcao/{funcao}")
  public ResponseEntity<List<PosicoesDTO>> findByFuncao(@PathVariable EFunPosicao f){
    List<Posicoes> find = s.findByFuncao(f);
    List<PosicoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping
  public ResponseEntity<List<PosicoesDTO>> findAll(){
    List<Posicoes> find = s.findAll();
    List<PosicoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
