package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.TemporadasCreateDTO;
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
  public ResponseEntity<TemporadasDTO> criar(@RequestBody TemporadasCreateDTO request){
    Temporadas m = mapper.map(request);
    m = service.salvar(m);
    TemporadasDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<TemporadasDTO> atualizar(@RequestBody TemporadasDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Temporadas mapped = mapper.map(r);
    Temporadas atualizado = service.atualizar(mapped, id);
    TemporadasDTO dto = mapper.map(atualizado);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
