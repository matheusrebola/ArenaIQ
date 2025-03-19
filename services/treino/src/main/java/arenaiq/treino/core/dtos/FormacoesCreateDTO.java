package arenaiq.treino.core.dtos;

import arenaiq.treino.core.models.enums.ECompacatacao;
import arenaiq.treino.core.models.enums.EFormacao;
import arenaiq.treino.core.models.enums.EModoJogo;
import lombok.Data;

@Data
public class FormacoesCreateDTO {
  private EFormacao formacao;
  private EModoJogo modo;
  private ECompacatacao compacatacao;
  private String url;
}
