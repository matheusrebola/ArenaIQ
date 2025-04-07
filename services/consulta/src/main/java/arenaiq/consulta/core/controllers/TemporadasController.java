package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.TemporadasDTO;
import arenaiq.consulta.core.mappers.TemporadasMapper;
import arenaiq.consulta.core.models.Temporadas;
import arenaiq.consulta.core.services.TemporadasService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/temporadas")
@RequiredArgsConstructor
public class TemporadasController {
  private final TemporadasService s;
  private final TemporadasMapper m;

  @GetMapping
  public ResponseEntity<List<TemporadasDTO>> findByAll(){
    List<Temporadas> find = s.findAll();
    List<TemporadasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("{temporada}")
  public ResponseEntity<List<TemporadasDTO>> findByTemporada(@PathVariable String t){
    List<Temporadas> find = s.findByTemporada(t);
    List<TemporadasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/inicio/{data-inicio}")
  public ResponseEntity<List<TemporadasDTO>> findByDataInicio(@PathVariable String i){
    List<Temporadas> find = s.findByDataInicio(i);
    List<TemporadasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/fim/{data-fim}")
  public ResponseEntity<List<TemporadasDTO>> findByDataFim(@PathVariable String f){
    List<Temporadas> find = s.findByDataFim(f);
    List<TemporadasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
