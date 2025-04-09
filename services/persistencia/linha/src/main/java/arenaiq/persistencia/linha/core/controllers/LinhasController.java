package arenaiq.persistencia.linha.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.persistencia.linha.core.dtos.LinhasDTO;
import arenaiq.persistencia.linha.core.mappers.LinhasMapper;
import arenaiq.persistencia.linha.core.models.Linhas;
import arenaiq.persistencia.linha.core.services.LinhasService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/linhas")
@RequiredArgsConstructor
public class LinhasController {
  private final LinhasService s;
  private final LinhasMapper m;

  @GetMapping
  public ResponseEntity<List<LinhasDTO>> encontrarTodos(){
    List<Linhas> l = s.encontrarTodos();
    List<LinhasDTO> dto = m.map(l);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
