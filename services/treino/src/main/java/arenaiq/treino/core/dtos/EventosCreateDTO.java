package arenaiq.treino.core.dtos;

import arenaiq.treino.core.models.enums.EAtor;
import arenaiq.treino.core.models.enums.EEvento;
import arenaiq.treino.core.models.enums.EMotivo;
import arenaiq.treino.core.models.enums.EQualidade;
import lombok.Data;

@Data
public class EventosCreateDTO {
  private EEvento evento;
  private EMotivo motivo;
  private EQualidade qualidade;
  private EAtor ator;
  private EAtor receptor;
  private String url;
}
