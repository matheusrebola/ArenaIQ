package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.ElencosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.ElencosDTO;
import arenaiq.dadoshistoricos.core.mappers.ElencosMapper;
import arenaiq.dadoshistoricos.core.models.Elencos;
import arenaiq.dadoshistoricos.core.services.ElencosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/elencos")
@RequiredArgsConstructor
public class ElencosController {
  private final ElencosMapper mapper;
  private final ElencosService service;
  
  @PostMapping
  public ResponseEntity<ElencosDTO> criar(@RequestBody ElencosCreateDTO request){
    Elencos m = mapper.map(request);
    m = service.salvar(m);
    ElencosDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<ElencosDTO> atualizar(@RequestBody ElencosDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Elencos mapped = mapper.map(r);
    Elencos atualizado = service.atualizar(mapped, id);
    ElencosDTO dto = mapper.map(atualizado);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
