package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  public ResponseEntity<List<MovimentacoesDTO>> findByAll(){
    List<Movimentacoes> find = s.findAll();
    List<MovimentacoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/x/{eixo}")
  public ResponseEntity<List<MovimentacoesDTO>> findByEixoX(@PathVariable Float x){
    List<Movimentacoes> find = s.findByEixoX(x);
    List<MovimentacoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/y/{eixo}")
  public ResponseEntity<List<MovimentacoesDTO>> findByEixoY(@PathVariable Float y){
    List<Movimentacoes> find = s.findByEixoY(y);
    List<MovimentacoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/velocidade/{velocidade}")
  public ResponseEntity<List<MovimentacoesDTO>> findByVelocidade(@PathVariable Float v){
    List<Movimentacoes> find = s.findByVelocidade(v);
    List<MovimentacoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/aceleracao/{aceleracao}")
  public ResponseEntity<List<MovimentacoesDTO>> findByAceleracao(@PathVariable Float a){
    List<Movimentacoes> find = s.findByAceleracao(a);
    List<MovimentacoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/minuto/{minuto}")
  public ResponseEntity<List<MovimentacoesDTO>> findByMinuto(@PathVariable Byte min){
    List<Movimentacoes> find = s.findByMinuto(min);
    List<MovimentacoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/segundo/{segundo}")
  public ResponseEntity<List<MovimentacoesDTO>> findBySegundo(@PathVariable Byte seg){
    List<Movimentacoes> find = s.findBySegundo(seg);
    List<MovimentacoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/pressao/{pressao}")
  public ResponseEntity<List<MovimentacoesDTO>> findByPressao(@PathVariable Boolean p){
    List<Movimentacoes> find = s.findByPressao(p);
    List<MovimentacoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
