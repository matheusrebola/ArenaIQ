package arenaiq.treino.core.dtos;

import arenaiq.treino.core.models.enums.ECompacatacao;
import arenaiq.treino.core.models.enums.EFormacao;
import arenaiq.treino.core.models.enums.EModoJogo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FormacoesDTO {
  private String id;
  private EFormacao formacao;
  private EModoJogo modo;
  private ECompacatacao compacatacao;
  private String url;
}
