package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.EquipesCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.EquipesDTO;
import arenaiq.dadoshistoricos.core.mappers.EquipeMapper;
import arenaiq.dadoshistoricos.core.models.Equipes;
import arenaiq.dadoshistoricos.core.services.EquipesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/equipes")
@RequiredArgsConstructor
public class EquipeController {
  private final EquipeMapper mapper;
  private final EquipesService service;

  @PostMapping
  public ResponseEntity<EquipesDTO> criar(@RequestBody EquipesCreateDTO request){
    Equipes m = mapper.map(request);
    m = service.salvar(m);
    EquipesDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }
}
