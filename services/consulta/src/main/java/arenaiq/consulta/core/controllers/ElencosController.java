package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.ElencosDTO;
import arenaiq.consulta.core.mappers.ElencosMapper;
import arenaiq.consulta.core.models.Elencos;
import arenaiq.consulta.core.services.ElencosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/elencos")
@RequiredArgsConstructor
public class ElencosController {
  private final ElencosService s;
  private final ElencosMapper m;

  @GetMapping("{equipe}")
  public ResponseEntity<List<ElencosDTO>> findByEquipe(@PathVariable String e){
    List<Elencos> find = s.findByEquipe(e);
    List<ElencosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/apelido/{apelido}")
  public ResponseEntity<List<ElencosDTO>> findByApelido(@PathVariable String a){
    List<Elencos> find = s.findByApelido(a);
    List<ElencosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/tecnico/{tecnico}")
  public ResponseEntity<List<ElencosDTO>> findByTecnico(@PathVariable String t){
    List<Elencos> find = s.findByTecnico(t);
    List<ElencosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
