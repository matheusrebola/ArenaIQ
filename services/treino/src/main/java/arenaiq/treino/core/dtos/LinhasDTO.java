package arenaiq.treino.core.dtos;

import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.treino.core.models.enums.ELargura;
import arenaiq.treino.core.models.enums.ELinha;
import arenaiq.treino.core.models.enums.EModoJogo;
import lombok.Data;

@Document
@Data
public class LinhasDTO {
  private String id;
  private ELinha linha;
  private EModoJogo altura;
  private ELargura largura;
  private String url;
}
