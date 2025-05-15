package arenaiq.cadastro.core.mappers;

import org.springframework.stereotype.Component;

import arenaiq.cadastro.core.dtos.CadastroCreateDTO;
import arenaiq.cadastro.core.dtos.CadastroDTO;
import arenaiq.cadastro.core.models.Usuarios;

@Component
public class CadastroMapper {

  public Usuarios map(CadastroCreateDTO c) {
    return Usuarios.builder()
                    .nome(c.getNome())
                    .email(c.getEmail())
                    .senha(c.getSenha())
                    .acesso(c.getAcesso())
                    .build();
  }

  public CadastroDTO map(Usuarios c) {
    return CadastroDTO.builder()
                      .id(c.getId())
                      .nome(c.getNome())
                      .acesso(c.getAcesso())
                      .build();
  }

}
