package arenaiq.cadastro.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.cadastro.core.dtos.CadastroCreateDTO;
import arenaiq.cadastro.core.dtos.CadastroDTO;
import arenaiq.cadastro.core.mappers.CadastroMapper;
import arenaiq.cadastro.core.models.Usuarios;
import arenaiq.cadastro.core.services.CadastroService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/cadastros")
@RequiredArgsConstructor
public class CadastroController {
  private final CadastroService service;
  private final CadastroMapper mapper;

  @PostMapping
  public ResponseEntity<CadastroDTO> cadastrar(@RequestBody CadastroCreateDTO dto){
    if (service.existenciaEmail(dto.getEmail())) {
      return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
    dto.setSenha(service.hashSenha(dto.getSenha()));
    Usuarios u = mapper.map(dto);
    Usuarios s = service.salvar(u);
    CadastroDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Usuarios>> encontrarTodos(){
    return new ResponseEntity<>(service.encontrarTodos(), HttpStatus.OK);
  }
}
