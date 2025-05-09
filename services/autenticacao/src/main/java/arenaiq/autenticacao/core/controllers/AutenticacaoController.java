package arenaiq.autenticacao.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arenaiq.autenticacao.core.dtos.AutenticacaoDTO;
import arenaiq.autenticacao.core.dtos.UsuarioDTO;
import arenaiq.autenticacao.core.services.AutenticacaoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/autenticacao")
@RequiredArgsConstructor
public class AutenticacaoController {
  private final AutenticacaoService service;

  @GetMapping
  public ResponseEntity<UsuarioDTO> autenticar(@RequestBody AutenticacaoDTO dto){
    UsuarioDTO u = service.validarUsuario(dto);
    if (u == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(u, HttpStatus.OK);
  }
}
