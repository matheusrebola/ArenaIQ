package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.TitulosDTO;
import arenaiq.dadoshistoricos.core.mappers.TitulosMapper;
import arenaiq.dadoshistoricos.core.models.Titulos;
import arenaiq.dadoshistoricos.core.services.TitulosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/titulos")
@RequiredArgsConstructor
public class TitulosController {
  private final TitulosMapper mapper;
  private final TitulosService service;

  @PostMapping
  public ResponseEntity<String> criar(@RequestBody TitulosDTO t){
    Titulos tit = mapper.map(t);
    service.salvar(tit);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> atualizar(@RequestBody TitulosDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Titulos mapped = mapper.map(r);
    service.atualizar(mapped, id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
