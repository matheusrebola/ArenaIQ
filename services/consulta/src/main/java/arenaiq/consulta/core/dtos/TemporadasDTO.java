package arenaiq.consulta.core.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TemporadasDTO {
  private String id;
  private String temporada;
  private String dataInicio;
  private String dataFim;
}
