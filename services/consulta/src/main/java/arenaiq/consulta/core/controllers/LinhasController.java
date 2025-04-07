package arenaiq.consulta.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.consulta.core.dtos.LinhasDTO;
import arenaiq.consulta.core.mappers.LinhasMapper;
import arenaiq.consulta.core.models.Linhas;
import arenaiq.consulta.core.models.enums.ELargura;
import arenaiq.consulta.core.models.enums.EModoJogo;
import arenaiq.consulta.core.services.LinhasService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/linhas")
@RequiredArgsConstructor
public class LinhasController {
  private final LinhasService s;
  private final LinhasMapper m;

  @GetMapping("/altura/{altura}")
  public ResponseEntity<List<LinhasDTO>> findByAltura(@PathVariable EModoJogo mj){
    List<Linhas> find = s.findByAltura(mj);
    List<LinhasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/largura/{largura}")
  public ResponseEntity<List<LinhasDTO>> findByLargura(@PathVariable ELargura l){
    List<Linhas> find = s.findByLargura(l);
    List<LinhasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/minuto/{minuto}")
  public ResponseEntity<List<LinhasDTO>> findByNome(@PathVariable Byte min){
    List<Linhas> find = s.findByMinuto(min);
    List<LinhasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }

  @GetMapping("/segundo/{segundo}")
  public ResponseEntity<List<LinhasDTO>> findBySegundo(@PathVariable Byte seg){
    List<Linhas> find = s.findBySegundo(seg);
    List<LinhasDTO> mapped = m.map(find);
    return new ResponseEntity<>(mapped, HttpStatus.OK);
  }
}
