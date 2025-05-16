package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.TemporadasDTO;
import arenaiq.dadoshistoricos.core.mappers.TemporadasMapper;
import arenaiq.dadoshistoricos.core.models.Temporadas;
import arenaiq.dadoshistoricos.core.services.TemporadasService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/temporadas")
@RequiredArgsConstructor
public class TemporadasController {
  private final TemporadasMapper mapper;
  private final TemporadasService service;

  @PostMapping
  public ResponseEntity<String> criar(@RequestBody TemporadasDTO t){
    Temporadas tem = mapper.map(t);
    service.salvar(tem);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> atualizar(@RequestBody TemporadasDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Temporadas mapped = mapper.map(r);
    service.atualizar(mapped, id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
