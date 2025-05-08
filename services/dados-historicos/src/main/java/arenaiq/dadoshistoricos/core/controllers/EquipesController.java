package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.EquipesCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.EquipesDTO;
import arenaiq.dadoshistoricos.core.mappers.EquipesMapper;
import arenaiq.dadoshistoricos.core.models.document.Equipes;
import arenaiq.dadoshistoricos.core.services.EquipesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/equipes")
@RequiredArgsConstructor
public class EquipesController {
  private final EquipesMapper mapper;
  private final EquipesService service;

  @PostMapping
  public ResponseEntity<EquipesDTO> criar(@RequestBody EquipesCreateDTO request){
    Equipes m = mapper.map(request);
    m = service.salvar(m);
    EquipesDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<EquipesDTO> atualizar(@RequestBody EquipesDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Equipes mapped = mapper.map(r);
    Equipes atualizado = service.atualizar(mapped, id);
    EquipesDTO dto = mapper.map(atualizado);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
