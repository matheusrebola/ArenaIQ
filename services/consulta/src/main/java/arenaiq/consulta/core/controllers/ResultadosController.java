package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.ResultadosDTO;
import arenaiq.consulta.core.mappers.ResultadosMapper;
import arenaiq.consulta.core.models.Resultados;
import arenaiq.consulta.core.services.ResultadosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/resultados")
@RequiredArgsConstructor
public class ResultadosController {
  private final ResultadosService s;
  private final ResultadosMapper m;

  @GetMapping
  public ResponseEntity<List<ResultadosDTO>> findByAll(){
    List<Resultados> find = s.findAll();
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/jogos-disputados/{jogos}")
  public ResponseEntity<List<ResultadosDTO>> findByJogosDisputados(@PathVariable Byte j){
    List<Resultados> find = s.findByJogosDisputados(j);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/vitorias/{vitorias}")
  public ResponseEntity<List<ResultadosDTO>> findByVitorias(@PathVariable Byte v){
    List<Resultados> find = s.findByVitorias(v);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/derrotas/{derrotas}")
  public ResponseEntity<List<ResultadosDTO>> findByDerrotas(@PathVariable Byte d){
    List<Resultados> find = s.findByDerrotas(d);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/empates/{empates}")
  public ResponseEntity<List<ResultadosDTO>> findByEmpates(@PathVariable Byte e){
    List<Resultados> find = s.findByEmpates(e);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/aproveitamento/{aproveitamento}")
  public ResponseEntity<List<ResultadosDTO>> findByAproveitamento(@PathVariable Float a){
    List<Resultados> find = s.findByAproveitamento(a);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/gols-marcados/{gols}")
  public ResponseEntity<List<ResultadosDTO>> findByGolsMarcados(@PathVariable Byte g){
    List<Resultados> find = s.findByGolsMarcados(g);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/gols-sofridos/{gols}")
  public ResponseEntity<List<ResultadosDTO>> findByGolsSofridos(@PathVariable Byte g){
    List<Resultados> find = s.findByGolsSofridos(g);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/desempenho/{desempenho}")
  public ResponseEntity<List<ResultadosDTO>> findByDesempenho(@PathVariable Float d){
    List<Resultados> find = s.findByDesempenho(d);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/competicao/{competicao}")
  public ResponseEntity<List<ResultadosDTO>> findByCompeticao(@PathVariable String c){
    List<Resultados> find = s.findByCompeticao(c);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/equipe/{equipe}")
  public ResponseEntity<List<ResultadosDTO>> findByEquipe(@PathVariable String e){
    List<Resultados> find = s.findByEquipe(e);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/temporada/{temporada}")
  public ResponseEntity<List<ResultadosDTO>> findByTemporada(@PathVariable String t){
    List<Resultados> find = s.findByTemporada(t);
    List<ResultadosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
