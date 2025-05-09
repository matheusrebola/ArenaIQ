package arenaiq.cadastro.core.dtos;

import arenaiq.cadastro.core.models.EAcesso;
import lombok.Data;

@Data
public class CadastroCreateDTO {
  private String nome;
  private String email;
  private String senha;
  private EAcesso acesso;
}
