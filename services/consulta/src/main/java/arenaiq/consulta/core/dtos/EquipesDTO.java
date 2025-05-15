package arenaiq.consulta.core.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EquipesDTO {
  private String id;
  private String nome;
  private String cidade;
  private String pais;
  private String anoFundacao;
}
