package arenaiq.cadastro.core.dtos;

import arenaiq.cadastro.core.models.EAcesso;
import lombok.Data;

@Data
public class CadastroDTO {
  private String id;
  private String nome;
  private EAcesso acesso;
}
