package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.JogadoresDTO;
import arenaiq.consulta.core.mappers.JogadoresMapper;
import arenaiq.consulta.core.models.Jogadores;
import arenaiq.consulta.core.models.enums.EContribuicao;
import arenaiq.consulta.core.models.enums.EEstilo;
import arenaiq.consulta.core.models.enums.EFuncao;
import arenaiq.consulta.core.models.enums.EPe;
import arenaiq.consulta.core.models.enums.EPersonalidade;
import arenaiq.consulta.core.services.JogadoresService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/jogadores")
@RequiredArgsConstructor
public class JogadoresController {
  private final JogadoresService s;
  private final JogadoresMapper m;

  @GetMapping
  public ResponseEntity<List<JogadoresDTO>> findByAll(){
    List<Jogadores> find = s.findAll();
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("{nome}")
  public ResponseEntity<JogadoresDTO> findByNome(@PathVariable String n){
    Jogadores find = s.findByNome(n);
    JogadoresDTO mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/nascimento/{nascimento}")
  public ResponseEntity<List<JogadoresDTO>> findByDataNascimento(@PathVariable String n){
    List<Jogadores> find = s.findByDataNascimento(n);
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/nacionalidade/{nacionalidade}")
  public ResponseEntity<List<JogadoresDTO>> findByNacionalidade(@PathVariable String n){
    List<Jogadores> find = s.findByNacionalidade(n);
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/funcao/{funcao}")
  public ResponseEntity<List<JogadoresDTO>> findByFuncao(@PathVariable EFuncao f){
    List<Jogadores> find = s.findByFuncao(f);
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/contribuicao/{contribuicao}")
  public ResponseEntity<List<JogadoresDTO>> findByContribuicao(@PathVariable EContribuicao c){
    List<Jogadores> find = s.findByContribuicao(c);
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/estilo/{estilo}")
  public ResponseEntity<List<JogadoresDTO>> findByEstilo(@PathVariable EEstilo e){
    List<Jogadores> find = s.findByEstilo(e);
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/personalidade/{personalidade}")
  public ResponseEntity<List<JogadoresDTO>> findByPersonalidade(@PathVariable EPersonalidade p){
    List<Jogadores> find = s.findByPersonalidade(p);
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/pe/{pe}")
  public ResponseEntity<List<JogadoresDTO>> findByPe(@PathVariable EPe p){
    List<Jogadores> find = s.findByPe(p);
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/altura/{altura}")
  public ResponseEntity<List<JogadoresDTO>> findByAltura(@PathVariable Float a){
    List<Jogadores> find = s.findByAltura(a);
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/peso/{peso}")
  public ResponseEntity<List<JogadoresDTO>> findByPeso(@PathVariable Float p){
    List<Jogadores> find = s.findByPeso(p);
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/posicao/{posicao}")
  public ResponseEntity<List<JogadoresDTO>> findByElenco(@PathVariable String e){
    List<Jogadores> find = s.findByPosicao(e);
    List<JogadoresDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
