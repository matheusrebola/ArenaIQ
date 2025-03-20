package arenaiq.treino.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.treino.core.models.enums.ELinha;
import lombok.Data;

@Document
@Data
public class Linhas {
  @Id
  private String id;
  private ELinha linha;
  private Float altura;
  private Float largura;
  private String url;
}
