package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.EquipesDTO;
import arenaiq.dadoshistoricos.core.mappers.EquipesMapper;
import arenaiq.dadoshistoricos.core.models.Equipes;
import arenaiq.dadoshistoricos.core.services.EquipesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/equipes")
@RequiredArgsConstructor
public class EquipesController {
  private final EquipesMapper mapper;
  private final EquipesService service;

  @PostMapping
  public ResponseEntity<String> criar(@RequestBody EquipesDTO e){
    Equipes eq = mapper.map(e);
    service.salvar(eq);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> atualizar(@RequestBody EquipesDTO e, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Equipes mapped = mapper.map(e);
    service.atualizar(mapped, id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
