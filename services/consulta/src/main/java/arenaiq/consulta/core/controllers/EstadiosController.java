package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.EstadiosDTO;
import arenaiq.consulta.core.mappers.EstadiosMapper;
import arenaiq.consulta.core.models.Estadios;
import arenaiq.consulta.core.models.enums.EClima;
import arenaiq.consulta.core.models.enums.ECobertura;
import arenaiq.consulta.core.models.enums.EDrenagem;
import arenaiq.consulta.core.models.enums.EGrama;
import arenaiq.consulta.core.models.enums.EInclinacao;
import arenaiq.consulta.core.models.enums.EVento;
import arenaiq.consulta.core.services.EstadiosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/estadios")
@RequiredArgsConstructor
public class EstadiosController {
  private final EstadiosService s;
  private final EstadiosMapper m;

  @GetMapping
  public ResponseEntity<List<EstadiosDTO>> findAll(){
    List<Estadios> e = s.findAll();
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/nome/{nome}")
  public ResponseEntity<List<EstadiosDTO>> findByNome(@PathVariable String n){
    List<Estadios> e = s.findByNome(n);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/cidade/{cidade}")
  public ResponseEntity<List<EstadiosDTO>> findByCidade(@PathVariable String c){
    List<Estadios> e = s.findByCidade(c);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/pais/{pais}")
  public ResponseEntity<List<EstadiosDTO>> findByPais(@PathVariable String p){
    List<Estadios> e = s.findByPais(p);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/mandante/{clube}")
  public ResponseEntity<List<EstadiosDTO>> findByClubeMandante(@PathVariable String c){
    List<Estadios> e = s.findByClubeMandante(c);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/capacidade/{capacidade}")
  public ResponseEntity<List<EstadiosDTO>> findByCapacidade(@PathVariable String c){
    List<Estadios> e = s.findByCapacidade(c);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/grama/{grama}")
  public ResponseEntity<List<EstadiosDTO>> findByGrama(@PathVariable EGrama g){
    List<Estadios> e = s.findByGrama(g);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/comprimento/{comprimento}")
  public ResponseEntity<List<EstadiosDTO>> findByComprimento(@PathVariable Byte c){
    List<Estadios> e = s.findByComprimento(c);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/largura/{largura}")
  public ResponseEntity<List<EstadiosDTO>> findByLargura(@PathVariable Byte l){
    List<Estadios> e = s.findByLargura(l);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/cobertura/{cobertura}")
  public ResponseEntity<List<EstadiosDTO>> findByCobertura(@PathVariable ECobertura c){
    List<Estadios> e = s.findByCobertura(c);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/drenagem/{drenagem}")
  public ResponseEntity<List<EstadiosDTO>> findByDrenagem(@PathVariable EDrenagem d){
    List<Estadios> e = s.findByDrenagem(d);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/inclinacao/{inclinacao}")
  public ResponseEntity<List<EstadiosDTO>>findByInclinacao(@PathVariable EInclinacao i){
    List<Estadios> e = s.findByInclinacao(i);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/vento/{vento}")
  public ResponseEntity<List<EstadiosDTO>> findByVento(@PathVariable EVento v){
    List<Estadios> e = s.findByVento(v);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/clima/{clima}")
  public ResponseEntity<List<EstadiosDTO>> findByClima(@PathVariable EClima c){
    List<Estadios> e = s.findByClima(c);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/reparo/{reparo}")
  public ResponseEntity<List<EstadiosDTO>> findByUltimoReparo(@PathVariable String u){
    List<Estadios> e = s.findByUltimoReparo(u);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/observacoes/{observacoes}")
  public ResponseEntity<List<EstadiosDTO>> findByObservacoes(@PathVariable String o){
    List<Estadios> e = s.findByObservacoes(o);
    List<EstadiosDTO> dto = m.map(e);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
