package arenaiq.treino.core.dtos;

import arenaiq.treino.core.models.enums.ELargura;
import arenaiq.treino.core.models.enums.ELinha;
import arenaiq.treino.core.models.enums.EModoJogo;
import lombok.Data;

@Data
public class LinhasCreateDTO {
  private ELinha linha;
  private EModoJogo altura;
  private ELargura largura;
  private String url;
}