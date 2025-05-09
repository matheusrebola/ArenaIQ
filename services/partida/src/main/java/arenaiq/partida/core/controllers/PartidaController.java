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

import arenaiq.partida.core.dtos.ElencosDTO;
import arenaiq.partida.core.dtos.PartidasCreateDTO;
import arenaiq.partida.core.dtos.PartidasDTO;
import arenaiq.partida.core.dtos.PartidaDTO;
import arenaiq.partida.core.mappers.PartidaMapper;
import arenaiq.partida.core.models.Jogadores;
import arenaiq.partida.core.models.Partidas;
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
  public ResponseEntity<PartidaDTO> criar(@RequestBody PartidasCreateDTO r){
    //criar partida
    Partidas p = pMapper.map(r);
    Partidas s = pService.salvar(p);
    //settar dto
    ElencosDTO e = new ElencosDTO(s.getTemporada(), s.getCasa(), s.getVisitante(), s.getId());
    //buscar lista de jogadores
    List<Jogadores> j = jService.criarElencosPorClube(e);
    PartidaDTO dto = pMapper.map(s,j);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<PartidasDTO>> encontrarTodos(){
    List<Partidas> p = pService.encontrarTodos();
    List<PartidasDTO> dto = pMapper.map(p);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<PartidasDTO> encontrarPorId(@PathVariable String id){
    Partidas p = pService.encontrarPeloId(id);
    PartidasDTO dto = pMapper.map(p);
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }
  
  @GetMapping("/jogadores")
  public ResponseEntity<List<Jogadores>> encontrarJogadores(){
    return new ResponseEntity<>(jService.findAll(), HttpStatus.OK);
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
