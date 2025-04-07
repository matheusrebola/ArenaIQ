package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.TitulosDTO;
import arenaiq.consulta.core.mappers.TitulosMapper;
import arenaiq.consulta.core.models.Titulos;
import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EParticipante;
import arenaiq.consulta.core.services.TitulosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/titulos")
@RequiredArgsConstructor
public class TitulosController {
  private final TitulosService s;
  private final TitulosMapper m;

  @GetMapping("/nome/{nome}")
  public ResponseEntity<List<TitulosDTO>> findByNome(@PathVariable String n){
    List<Titulos> find = s.findByNome(n);
    List<TitulosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/participante/{participante}")
  public ResponseEntity<List<TitulosDTO>> findByParticipante(@PathVariable EParticipante p){
    List<Titulos> find = s.findByParticipante(p);
    List<TitulosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/temporada/{temporada}")
  public ResponseEntity<List<TitulosDTO>> findByTemporada(@PathVariable String t){
    List<Titulos> find = s.findByTemporada(t);
    List<TitulosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/posicao/{posicao}")
  public ResponseEntity<List<TitulosDTO>> findByPosicao(@PathVariable String p){
    List<Titulos> find = s.findByPosicao(p);
    List<TitulosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/mvp/{mvp}")
  public ResponseEntity<List<TitulosDTO>> findByMvp(@PathVariable String mvp){
    List<Titulos> find = s.findByMvp(mvp);
    List<TitulosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/tipo/{tipo}")
  public ResponseEntity<List<TitulosDTO>> findByTipoTitulo(@PathVariable ECompeticao t){
    List<Titulos> find = s.findByTipoTitulo(t);
    List<TitulosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/equipe/{equipe}")
  public ResponseEntity<List<TitulosDTO>> findByEquipe(@PathVariable String e){
    List<Titulos> find = s.findByEquipe(e);
    List<TitulosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/competicao/{competicao}")
  public ResponseEntity<List<TitulosDTO>> findByCompeticao(@PathVariable String f){
    List<Titulos> find = s.findByCompeticao(f);
    List<TitulosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
