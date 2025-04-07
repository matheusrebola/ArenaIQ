package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.CompeticoesDTO;
import arenaiq.consulta.core.mappers.CompeticoesMapper;
import arenaiq.consulta.core.models.Competicoes;
import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EDisputa;
import arenaiq.consulta.core.services.CompeticoesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/competicoes")
@RequiredArgsConstructor
public class CompeticoesController {
  private final CompeticoesService s;
  private final CompeticoesMapper m;

  @GetMapping("/nome/{nome}")
  public ResponseEntity<List<CompeticoesDTO>> findByNome(@PathVariable String n){
    List<Competicoes> find = s.findByNome(n);
    List<CompeticoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/temporada/{temporada}")
  public ResponseEntity<List<CompeticoesDTO>> findByTemporada(@PathVariable String t){
    List<Competicoes> find = s.findByTemporada(t);
    List<CompeticoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("{competicao}")
  public ResponseEntity<List<CompeticoesDTO>> findByCompeticao(@PathVariable ECompeticao c){
    List<Competicoes> find = s.findByCompeticao(c);
    List<CompeticoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/disputa/{disputa}")
  public ResponseEntity<List<CompeticoesDTO>> findByDisputa(@PathVariable EDisputa d){
    List<Competicoes> find = s.findByDisputa(d);
    List<CompeticoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/localidade/{localidade}")
  public ResponseEntity<List<CompeticoesDTO>> findByLocalidade(@PathVariable String l){
    List<Competicoes> find = s.findByLocalidade(l);
    List<CompeticoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

}
