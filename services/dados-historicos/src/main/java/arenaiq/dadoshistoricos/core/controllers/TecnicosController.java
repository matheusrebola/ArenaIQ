package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.TecnicosDTO;
import arenaiq.dadoshistoricos.core.mappers.TecnicosMapper;
import arenaiq.dadoshistoricos.core.models.Tecnicos;
import arenaiq.dadoshistoricos.core.services.TecnicosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/tecnicos")
@RequiredArgsConstructor
public class TecnicosController {
  private final TecnicosMapper mapper;
  private final TecnicosService service;

  @PostMapping
  public ResponseEntity<String> criar(@RequestBody TecnicosDTO t){
    Tecnicos tec = mapper.map(t);
    service.salvar(tec);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> atualizar(@RequestBody TecnicosDTO t, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Tecnicos mapped = mapper.map(t);
    service.atualizar(mapped, id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
