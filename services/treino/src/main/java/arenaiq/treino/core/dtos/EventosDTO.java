package arenaiq.treino.core.dtos;

import org.springframework.data.mongodb.core.mapping.Document;

import arenaiq.treino.core.models.enums.EAtor;
import arenaiq.treino.core.models.enums.EEvento;
import arenaiq.treino.core.models.enums.EMotivo;
import lombok.Data;

@Document
@Data
public class EventosDTO {
  private String id;
  private EEvento evento;
  private EMotivo motivo;
  private EAtor ator;
  private EAtor receptor;
  private String url;
}
