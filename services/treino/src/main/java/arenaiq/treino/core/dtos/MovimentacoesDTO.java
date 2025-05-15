package arenaiq.treino.core.dtos;

import arenaiq.treino.core.models.enums.EFormacao;
import arenaiq.treino.core.models.enums.EPosicao;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovimentacoesDTO {
  private String id;
  private EPosicao inicial;
  private EPosicao atual;
  private EFormacao formacao;
  private String url;
}
