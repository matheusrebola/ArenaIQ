package arenaiq.partida.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.partida.core.dtos.PartidaCreateDTO;
import arenaiq.partida.core.dtos.PartidaDTO;
import arenaiq.partida.core.mappers.PartidaMapper;
import arenaiq.partida.core.models.Partida;
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

  @PostMapping
  public ResponseEntity<PartidaDTO> criar(@RequestBody PartidaCreateDTO request){
    Partida p = pMapper.map(request);
    Partida s = pService.salvar(p);
    var j = jService.criarElencos(p);
    PartidaDTO dto = pMapper.map(s,j);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<PartidaDTO>> encontrarTodos(){
    List<Partida> p = pService.encontrarTodos();
    List<PartidaDTO> dto = pMapper.map(p);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deletar(@PathVariable String id){
    pService.deletarPorId(id);
    return new ResponseEntity<>("deletado com sucesso", HttpStatus.GONE);
  }

  @DeleteMapping
  public ResponseEntity<String> deletarTodos(){
    pService.deletarTodos();
    return new ResponseEntity<>("banco limpo", HttpStatus.GONE);
  }
}
