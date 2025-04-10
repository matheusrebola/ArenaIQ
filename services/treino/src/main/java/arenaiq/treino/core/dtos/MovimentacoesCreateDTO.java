package arenaiq.treino.core.dtos;

import arenaiq.treino.core.models.enums.EFormacao;
import arenaiq.treino.core.models.enums.EPosicao;
import lombok.Data;

@Data
public class MovimentacoesCreateDTO {
  private EPosicao inicial;
  private EPosicao atual;
  private EFormacao formacao;
  private String url;
}
