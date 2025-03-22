package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.ElencosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.ElencosDTO;
import arenaiq.dadoshistoricos.core.mappers.ElencoMapper;
import arenaiq.dadoshistoricos.core.models.Elencos;
import arenaiq.dadoshistoricos.core.services.ElencosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/elencos")
@RequiredArgsConstructor
public class ElencoController {
  private final ElencoMapper mapper;
  private final ElencosService service;
  
  @PostMapping
  public ResponseEntity<ElencosDTO> criar(@RequestBody ElencosCreateDTO request){
    Elencos m = mapper.map(request);
    m = service.salvar(m);
    ElencosDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }
}
