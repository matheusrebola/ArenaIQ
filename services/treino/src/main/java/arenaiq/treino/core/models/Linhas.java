package arenaiq.treino.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.treino.core.models.enums.ELargura;
import arenaiq.treino.core.models.enums.ELinha;
import arenaiq.treino.core.models.enums.EModoJogo;
import lombok.Builder;
import lombok.Data;

@Document(collection = "linhas")
@Data
@Builder
public class Linhas {
  @Id
  private String id;
  private ELinha linha;
  private EModoJogo altura;
  private ELargura largura;
  private String url;
}
