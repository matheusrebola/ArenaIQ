package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.JogadoresCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.JogadoresDTO;
import arenaiq.dadoshistoricos.core.mappers.JogadoresMapper;
import arenaiq.dadoshistoricos.core.models.Jogadores;
import arenaiq.dadoshistoricos.core.services.JogadoresService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/jogadores")
@RequiredArgsConstructor
public class JogadoresController {
  private final JogadoresMapper mapper;
  private final JogadoresService service;

  @PostMapping
  public ResponseEntity<JogadoresDTO> criar(@RequestBody JogadoresCreateDTO request){
    Jogadores m = mapper.map(request);
    m = service.salvar(m);
    JogadoresDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<JogadoresDTO> atualizar(@RequestBody JogadoresDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Jogadores mapped = mapper.map(r);
    Jogadores atualizado = service.atualizar(mapped, id);
    JogadoresDTO dto = mapper.map(atualizado);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
