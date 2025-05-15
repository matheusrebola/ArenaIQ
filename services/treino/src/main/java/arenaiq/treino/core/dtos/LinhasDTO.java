package arenaiq.treino.core.dtos;

import arenaiq.treino.core.models.enums.ELargura;
import arenaiq.treino.core.models.enums.ELinha;
import arenaiq.treino.core.models.enums.EModoJogo;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LinhasDTO {
  private String id;
  private ELinha linha;
  private EModoJogo altura;
  private ELargura largura;
  private String url;
}
