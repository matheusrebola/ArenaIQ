package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.JogadoresElencoDTO;
import arenaiq.consulta.core.mappers.JogadoresElencoMapper;
import arenaiq.consulta.core.models.JogadoresElenco;
import arenaiq.consulta.core.services.JogadoresElencoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/jogador-elenco")
@RequiredArgsConstructor
public class JogadoresElencoController {
  private final JogadoresElencoService s;
  private final JogadoresElencoMapper m;

  @GetMapping
  public ResponseEntity<List<JogadoresElencoDTO>> findByAll(){
    List<JogadoresElenco> find = s.findAll();
    List<JogadoresElencoDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("{elenco}")
  public ResponseEntity<List<JogadoresElencoDTO>> findByElenco(@PathVariable String e){
    List<JogadoresElenco> find = s.findByElenco(e);
    List<JogadoresElencoDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/temporada/{temporada}")
  public ResponseEntity<List<JogadoresElencoDTO>> findByTemporada(@PathVariable String t){
    List<JogadoresElenco> find = s.findByTemporada(t);
    List<JogadoresElencoDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("jogador/{jogador}")
  public ResponseEntity<List<JogadoresElencoDTO>> findByJogador(@PathVariable String j){
    List<JogadoresElenco> find = s.findByJogador(j);
    List<JogadoresElencoDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
