package arenaiq.dadoshistoricos.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document (collection = "temporadas")
@Data
@Builder
public class Temporadas {
  @Id
  private String id;
  private String temporada;
  private String dataInicio;
  private String dataFim;
}
