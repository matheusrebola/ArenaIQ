package arenaiq.dadoshistoricos.core.dtos;

import lombok.Data;

@Data
public class EquipesCreateDTO {
  private String nome;
  private String cidade;
  private String pais;
  private String anoFundacao;
}
