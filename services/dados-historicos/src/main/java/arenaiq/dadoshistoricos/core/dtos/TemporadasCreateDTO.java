package arenaiq.dadoshistoricos.core.dtos;

import lombok.Data;

@Data
public class TemporadasCreateDTO {
  private String temporada;
  private String dataInicio;
  private String dataFim;
}
