package arenaiq.cadastro.core.dtos;

import arenaiq.cadastro.core.models.EAcesso;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CadastroDTO {
  private String id;
  private String nome;
  private EAcesso acesso;
}
