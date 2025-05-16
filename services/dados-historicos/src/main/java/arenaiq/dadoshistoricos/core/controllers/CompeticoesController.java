package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.CompeticoesDTO;
import arenaiq.dadoshistoricos.core.mappers.CompeticoesMapper;
import arenaiq.dadoshistoricos.core.models.Competicoes;
import arenaiq.dadoshistoricos.core.services.CompeticoesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/competicoes")
@RequiredArgsConstructor
public class CompeticoesController {
  private final CompeticoesMapper mapper;
  private final CompeticoesService service;

  @PostMapping
  public ResponseEntity<String> criar(@RequestBody CompeticoesDTO c){
    Competicoes comp = mapper.map(c);
    service.salvar(comp);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> atualizar(@RequestBody CompeticoesDTO c, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Competicoes mapped = mapper.map(c);
    service.atualizar(mapped, id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
