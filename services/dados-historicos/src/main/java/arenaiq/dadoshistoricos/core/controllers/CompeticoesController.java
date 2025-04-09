package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.CompeticoesCreateDTO;
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
  public ResponseEntity<CompeticoesDTO> criar(@RequestBody CompeticoesCreateDTO request){
    Competicoes m = mapper.map(request);
    Competicoes s = service.salvar(m);
    CompeticoesDTO dto = mapper.map(s);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<CompeticoesDTO> atualizar(@RequestBody CompeticoesDTO r, @PathVariable String id){
    Boolean exist = service.exists(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Competicoes mapped = mapper.map(r);
    Competicoes atualizado = service.atualizar(mapped, id);
    CompeticoesDTO dto = mapper.map(atualizado);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

}
