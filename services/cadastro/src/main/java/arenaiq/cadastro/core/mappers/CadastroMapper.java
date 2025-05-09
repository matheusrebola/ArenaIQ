package arenaiq.cadastro.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import arenaiq.cadastro.core.dtos.CadastroCreateDTO;
import arenaiq.cadastro.core.dtos.CadastroDTO;
import arenaiq.cadastro.core.models.Usuarios;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CadastroMapper {
  private final ModelMapper mapper;

  public Usuarios map(CadastroCreateDTO c) {
    return mapper.map(c, Usuarios.class);
  }

  public CadastroDTO map(Usuarios c) {
    return mapper.map(c, CadastroDTO.class);
  }

}
