package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.CompeticoesDTO;
import arenaiq.consulta.core.mappers.CompeticoesMapper;
import arenaiq.consulta.core.models.Competicoes;
import arenaiq.consulta.core.models.enums.ECompeticao;
import arenaiq.consulta.core.models.enums.EDisputa;
import arenaiq.consulta.core.services.CompeticoesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/competicoes")
@RequiredArgsConstructor
public class CompeticaoController {
  private final CompeticoesService s;
  private final CompeticoesMapper m;

  @GetMapping("{nome}")
  public ResponseEntity<List<CompeticoesDTO>> findByNome(@PathVariable String nome){
    List<Competicoes> find = s.findByNome(nome);
    List<CompeticoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("{temporada}")
  public ResponseEntity<List<CompeticoesDTO>> findByTemporada(@PathVariable String temporada){
    List<Competicoes> find = s.findByTemporada(temporada);
    List<CompeticoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("{competicao}")
  public ResponseEntity<List<CompeticoesDTO>> findByCompeticao(@PathVariable ECompeticao competicao){
    List<Competicoes> find = s.findByCompeticao(competicao);
    List<CompeticoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("{disputa}")
  public ResponseEntity<List<CompeticoesDTO>> findByDisputa(@PathVariable EDisputa disputa){
    List<Competicoes> find = s.findByDisputa(disputa);
    List<CompeticoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("{localidade}")
  public ResponseEntity<List<CompeticoesDTO>> findByLocalidade(@PathVariable String localidade){
    List<Competicoes> find = s.findByLocalidade(localidade);
    List<CompeticoesDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

}
