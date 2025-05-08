package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.TecnicosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.TecnicosDTO;
import arenaiq.dadoshistoricos.core.mappers.TecnicosMapper;
import arenaiq.dadoshistoricos.core.models.document.Tecnicos;
import arenaiq.dadoshistoricos.core.services.TecnicosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/tecnicos")
@RequiredArgsConstructor
public class TecnicosController {
  private final TecnicosMapper mapper;
  private final TecnicosService service;

  @PostMapping
  public ResponseEntity<TecnicosDTO> criar(@RequestBody TecnicosCreateDTO request){
    Tecnicos m = mapper.map(request);
    m = service.salvar(m);
    TecnicosDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<TecnicosDTO> atualizar(@RequestBody TecnicosDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Tecnicos mapped = mapper.map(r);
    Tecnicos atualizado = service.atualizar(mapped, id);
    TecnicosDTO dto = mapper.map(atualizado);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
