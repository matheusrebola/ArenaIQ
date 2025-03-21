package arenaiq.partida.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.partida.core.dtos.JogadorDTO;
import arenaiq.partida.core.dtos.PartidaCreateDTO;
import arenaiq.partida.core.dtos.PartidaDTO;
import arenaiq.partida.core.mappers.PartidaMapper;
import arenaiq.partida.core.models.Partida;
import arenaiq.partida.core.repositories.JogadoresElencoRepository;
import arenaiq.partida.core.services.JogadorService;
import arenaiq.partida.core.services.PartidaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/partidas")
@RequiredArgsConstructor
public class PartidaController {
  private final PartidaMapper pMapper;
  private final PartidaService pService;
  private final JogadorService jService;
  private final JogadoresElencoRepository repository;

  public List<JogadorDTO> encontrarJogadores(String elenco, String temporada){
    return repository.findJogadorByElencoAndTemporada(elenco, temporada);
  }

  @PostMapping("/historica")
  public ResponseEntity<PartidaDTO> criar(@RequestBody PartidaCreateDTO request){
    Partida p = pMapper.map(request);
    Partida s = pService.salvar(p);
    jService.criarElencos(p);
    PartidaDTO dto = pMapper.map(s);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }
}
