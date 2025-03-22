package arenaiq.dadoshistoricos.core.dtos;

import arenaiq.dadoshistoricos.core.models.enums.EFunPosicao;
import arenaiq.dadoshistoricos.core.models.enums.EPosicao;
import lombok.Data;

@Data
public class PosicoesDTO {
  private String id;
  private EPosicao posicao;
  private EFunPosicao funcao;
  private String descricao;
}
