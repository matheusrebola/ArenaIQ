package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.EquipesDTO;
import arenaiq.consulta.core.mappers.EquipesMapper;
import arenaiq.consulta.core.models.Equipes;
import arenaiq.consulta.core.services.EquipesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/equipes")
@RequiredArgsConstructor
public class EquipesController {
  private final EquipesService s;
  private final EquipesMapper m;

  @GetMapping
  public ResponseEntity<List<EquipesDTO>> findByAll(){
    List<Equipes> find = s.findAll();
    List<EquipesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("{nome}")
  public ResponseEntity<List<EquipesDTO>> findByNome(@PathVariable String n){
    List<Equipes> find = s.findByNome(n);
    List<EquipesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/cidade/{cidade}")
  public ResponseEntity<List<EquipesDTO>> findByCidade(@PathVariable String c){
    List<Equipes> find = s.findByCidade(c);
    List<EquipesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/pais/{pais}")
  public ResponseEntity<List<EquipesDTO>> findByPais(@PathVariable String p){
    List<Equipes> find = s.findByPais(p);
    List<EquipesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/ano/{ano}")
  public ResponseEntity<List<EquipesDTO>> findByAnoFundacao(@PathVariable String a){
    List<Equipes> find = s.findByAnoFundacao(a);
    List<EquipesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
