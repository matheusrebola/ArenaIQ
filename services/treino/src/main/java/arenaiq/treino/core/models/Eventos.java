package arenaiq.treino.core.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.treino.core.models.enums.EAtor;
import arenaiq.treino.core.models.enums.EEvento;
import arenaiq.treino.core.models.enums.EMotivo;
import arenaiq.treino.core.models.enums.EQualidade;
import lombok.Data;

@Document
@Data
public class Eventos {
  @Id
  private String id;
  private EEvento evento;
  private EMotivo motivo;
  private EQualidade qualidade;
  private EAtor ator;
  private EAtor receptor;
  private String url;
}
