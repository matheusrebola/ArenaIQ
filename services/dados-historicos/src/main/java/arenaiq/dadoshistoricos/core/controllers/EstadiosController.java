package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.EstadiosDTO;
import arenaiq.dadoshistoricos.core.mappers.EstadiosMapper;
import arenaiq.dadoshistoricos.core.models.Estadios;
import arenaiq.dadoshistoricos.core.services.EstadiosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/estadios")
@RequiredArgsConstructor
public class EstadiosController {
  private final EstadiosService service;
  private final EstadiosMapper mapper;

  @PostMapping
  public ResponseEntity<String> criar(@RequestBody EstadiosDTO e){
    Estadios es = mapper.map(e);
    service.salvar(es);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }
  
  @PutMapping("/{id}")
  public ResponseEntity<String> atualizar(@RequestBody EstadiosDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Estadios mapped = mapper.map(r);
    service.atualizar(mapped, id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
