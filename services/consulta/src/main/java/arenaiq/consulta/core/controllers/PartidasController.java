package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.PartidasDTO;
import arenaiq.consulta.core.mappers.PartidasMapper;
import arenaiq.consulta.core.models.Partidas;
import arenaiq.consulta.core.services.PartidasService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/partidas")
@RequiredArgsConstructor
public class PartidasController {
  private final PartidasService s;
  private final PartidasMapper m;

  @GetMapping
  public ResponseEntity<List<PartidasDTO>> findByAll(){
    List<Partidas> find = s.findAll();
    List<PartidasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/data/{data}")
  public ResponseEntity<List<PartidasDTO>> findByDataHora(@PathVariable String d){
    List<Partidas> find = s.findByDataHora(d);
    List<PartidasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/local/{local}")
  public ResponseEntity<List<PartidasDTO>> findByLocal(@PathVariable String l){
    List<Partidas> find = s.findByLocal(l);
    List<PartidasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/casa/{casa}")
  public ResponseEntity<List<PartidasDTO>> findByCasa(@PathVariable String c){
    List<Partidas> find = s.findByCasa(c);
    List<PartidasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/visitante/{visitante}")
  public ResponseEntity<List<PartidasDTO>> findByVisitante(@PathVariable String v){
    List<Partidas> find = s.findByVisitante(v);
    List<PartidasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/placar/{casa}")
  public ResponseEntity<List<PartidasDTO>> findByPlacarC(@PathVariable Byte pc){
    List<Partidas> find = s.findByPlacarC(pc);
    List<PartidasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/placar/{fora}")
  public ResponseEntity<List<PartidasDTO>> findByPlacarV(@PathVariable Byte pv){
    List<Partidas> find = s.findByPlacarV(pv);
    List<PartidasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/competicao/{competicao}")
  public ResponseEntity<List<PartidasDTO>> findByEixoX(@PathVariable String c){
    List<Partidas> find = s.findByCompeticao(c);
    List<PartidasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

}
