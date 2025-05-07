package arenaiq.treino.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.treino.core.models.enums.ECompacatacao;
import arenaiq.treino.core.models.enums.EFormacao;
import arenaiq.treino.core.models.enums.EModoJogo;
import lombok.Data;

@Document(collection = "formacoes")
@Data
public class Formacoes {
  @Id
  private String id;
  private EFormacao formacao;
  private EModoJogo modo;
  private ECompacatacao compacatacao;
  private String url;
}
