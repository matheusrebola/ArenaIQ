package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.EstadiosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.EstadiosDTO;
import arenaiq.dadoshistoricos.core.mappers.EstadiosMapper;
import arenaiq.dadoshistoricos.core.models.Estadios;
import arenaiq.dadoshistoricos.core.services.EstadiosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/estadios")
@RequiredArgsConstructor
public class EstadiosController {
  private final EstadiosService s;
  private final EstadiosMapper m;

  @PostMapping
  public ResponseEntity<EstadiosDTO> criar(@RequestBody EstadiosCreateDTO dto){
    var e = m.map(dto);
    e = s.salvar(e);
    var r = m.map(e);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }
  
  @PutMapping("/{id}")
  public ResponseEntity<EstadiosDTO> atualizar(@RequestBody EstadiosDTO r, @PathVariable String id){
    Boolean exist = s.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Estadios mapped = m.map(r);
    Estadios atualizado = s.atualizar(mapped, id);
    EstadiosDTO dto = m.map(atualizado);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
