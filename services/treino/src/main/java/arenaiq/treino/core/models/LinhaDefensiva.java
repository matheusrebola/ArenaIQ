package arenaiq.treino.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class LinhaDefensiva {
  @Id
  private String id;
  private Float altura;
  private Float largura;
  private String url;
}
