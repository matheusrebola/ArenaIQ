package arenaiq.dadoshistoricos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.dadoshistoricos.core.dtos.JogadoresElencoCreateDTO;
import arenaiq.dadoshistoricos.core.dtos.JogadoresElencoDTO;
import arenaiq.dadoshistoricos.core.mappers.JogadorElencoMapper;
import arenaiq.dadoshistoricos.core.models.JogadoresElenco;
import arenaiq.dadoshistoricos.core.services.JogadoresElencoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/jogador-elenco")
@RequiredArgsConstructor
public class JogadorElencoController {
  private final JogadorElencoMapper mapper;
  private final JogadoresElencoService service;

  @PostMapping
  public ResponseEntity<JogadoresElencoDTO> criar(@RequestBody JogadoresElencoCreateDTO request) {
    JogadoresElenco m = mapper.map(request);
    m = service.salvar(m);
    JogadoresElencoDTO dto = mapper.map(m);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }
}
