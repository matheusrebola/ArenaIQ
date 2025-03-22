package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.ResultadosCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.ResultadosDTO;
import arenaiq.dadoshistoricos.core.mappers.ResultadoMapper;
import arenaiq.dadoshistoricos.core.models.Resultados;
import arenaiq.dadoshistoricos.core.services.ResultadosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/resultados")
@RequiredArgsConstructor
public class ResultadoController {
  private final ResultadoMapper mapper;
  private final ResultadosService service;

  @PostMapping
  public ResponseEntity<ResultadosDTO> criar(@RequestBody ResultadosCreateDTO request){
    Resultados m = mapper.map(request);
    m = service.salvar(m);
    ResultadosDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }
}
