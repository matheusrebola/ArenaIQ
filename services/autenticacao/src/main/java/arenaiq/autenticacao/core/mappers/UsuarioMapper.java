package arenaiq.autenticacao.core.mappers;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.autenticacao.core.dtos.UsuarioDTO;
import arenaiq.autenticacao.core.models.Usuarios;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UsuarioMapper {
  private final ModelMapper mapper;

  public UsuarioDTO map(Usuarios u) {
    UsuarioDTO dto = mapper.map(u, UsuarioDTO.class);
    dto.setChave(UUID.randomUUID());
    return dto;
  }

}
