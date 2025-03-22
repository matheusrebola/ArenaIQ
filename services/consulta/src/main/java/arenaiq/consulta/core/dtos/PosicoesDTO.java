package arenaiq.consulta.core.dtos;

import arenaiq.consulta.core.models.enums.EFunPosicao;
import arenaiq.consulta.core.models.enums.EPosicao;
import lombok.Data;

@Data
public class PosicoesDTO {
  private String id;
  private EPosicao posicao;
  private EFunPosicao funcao;
  private String descricao;
}
