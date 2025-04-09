package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.JogadoresElencoCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.JogadoresElencoDTO;
import arenaiq.dadoshistoricos.core.mappers.JogadoresElencoMapper;
import arenaiq.dadoshistoricos.core.models.JogadoresElenco;
import arenaiq.dadoshistoricos.core.services.JogadoresElencoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/jogador-elenco")
@RequiredArgsConstructor
public class JogadoresElencoController {
  private final JogadoresElencoMapper mapper;
  private final JogadoresElencoService service;

  @PostMapping
  public ResponseEntity<JogadoresElencoDTO> criar(@RequestBody JogadoresElencoCreateDTO request) {
    JogadoresElenco m = mapper.map(request);
    m = service.salvar(m);
    JogadoresElencoDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<JogadoresElencoDTO> atualizar(@RequestBody JogadoresElencoDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    JogadoresElenco mapped = mapper.map(r);
    JogadoresElenco atualizado = service.atualizar(mapped, id);
    JogadoresElencoDTO dto = mapper.map(atualizado);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
