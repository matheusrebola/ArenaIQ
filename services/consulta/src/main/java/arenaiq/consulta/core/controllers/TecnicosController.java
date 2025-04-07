package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.TecnicosDTO;
import arenaiq.consulta.core.mappers.TecnicosMapper;
import arenaiq.consulta.core.models.Tecnicos;
import arenaiq.consulta.core.models.enums.EFilosofia;
import arenaiq.consulta.core.services.TecnicosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/tecnicos")
@RequiredArgsConstructor
public class TecnicosController {
  private final TecnicosService s;
  private final TecnicosMapper m;

  @GetMapping
  public ResponseEntity<List<TecnicosDTO>> findByAll(){
    List<Tecnicos> find = s.findAll();
    List<TecnicosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/nome/{nome}")
  public ResponseEntity<List<TecnicosDTO>> findByNome(@PathVariable String n){
    List<Tecnicos> find = s.findByNome(n);
    List<TecnicosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/nacionalidade/{nacionalidade}")
  public ResponseEntity<List<TecnicosDTO>> findByNacionalidade(@PathVariable String n){
    List<Tecnicos> find = s.findByNacionalidade(n);
    List<TecnicosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/data-nascimento/{data}")
  public ResponseEntity<List<TecnicosDTO>> findByDataNascimento(@PathVariable String d){
    List<Tecnicos> find = s.findByDataNascimento(d);
    List<TecnicosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/experiencia/{anos}")
  public ResponseEntity<List<TecnicosDTO>> findByAnosExperiencia(@PathVariable Byte a){
    List<Tecnicos> find = s.findByAnosExperiencia(a);
    List<TecnicosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/filosofia/{filosofia}")
  public ResponseEntity<List<TecnicosDTO>> findBy(@PathVariable EFilosofia f){
    List<Tecnicos> find = s.findByFilosofia(f);
    List<TecnicosDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
