package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.ResultadosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.ResultadosDTO;
import arenaiq.dadoshistoricos.core.mappers.ResultadosMapper;
import arenaiq.dadoshistoricos.core.models.document.Resultados;
import arenaiq.dadoshistoricos.core.services.ResultadosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/resultados")
@RequiredArgsConstructor
public class ResultadosController {
  private final ResultadosMapper mapper;
  private final ResultadosService service;

  @PostMapping
  public ResponseEntity<ResultadosDTO> criar(@RequestBody ResultadosCreateDTO request){
    Resultados m = mapper.map(request);
    m = service.salvar(m);
    ResultadosDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<ResultadosDTO> atualizar(@RequestBody ResultadosDTO r, @PathVariable String id){
    Boolean exist = service.existsById(id);
    if (exist == false){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Resultados mapped = mapper.map(r);
    Resultados atualizado = service.atualizar(mapped, id);
    ResultadosDTO dto = mapper.map(atualizado);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
}
