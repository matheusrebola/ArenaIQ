package arenaiq.autenticacao.core.dtos;

import java.util.UUID;

import arenaiq.autenticacao.core.models.EAcesso;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDTO {
  private String id;
  private String nome;
  private EAcesso acesso;
  private UUID chave;
}
