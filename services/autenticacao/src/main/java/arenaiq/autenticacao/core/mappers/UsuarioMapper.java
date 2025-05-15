package arenaiq.autenticacao.core.mappers;

import java.util.UUID;

import org.springframework.stereotype.Component;

import arenaiq.autenticacao.core.dtos.UsuarioDTO;
import arenaiq.autenticacao.core.models.Usuarios;

@Component
public class UsuarioMapper {

  public UsuarioDTO map(Usuarios u) {
    return UsuarioDTO.builder()
                      .id(u.getId())
                      .nome(u.getNome())
                      .acesso(u.getAcesso())
                      .chave(UUID.randomUUID())
                      .build();
  }

}
