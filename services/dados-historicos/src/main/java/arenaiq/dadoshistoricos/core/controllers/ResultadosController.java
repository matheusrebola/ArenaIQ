package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.ResultadosDTO;
import arenaiq.dadoshistoricos.core.mappers.ResultadosMapper;
import arenaiq.dadoshistoricos.core.models.Resultados;
import arenaiq.dadoshistoricos.core.services.ResultadosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/resultados")
@RequiredArgsConstructor
public class ResultadosController {
  private final ResultadosMapper mapper;
  private final ResultadosService service;

  @PostMapping
  public ResponseEntity<String> criar(@RequestBody ResultadosDTO r){
    Resultados res = mapper.map(r);
    service.salvar(res);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> atualizar(@RequestBody ResultadosDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Resultados mapped = mapper.map(r);
    service.atualizar(mapped, id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
