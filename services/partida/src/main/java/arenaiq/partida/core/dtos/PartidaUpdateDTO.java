package arenaiq.partida.core.dtos;

import arenaiq.partida.core.models.enums.EClima;
import lombok.Data;

@Data
public class PartidaUpdateDTO {
  private EClima clima;
  private Float temperatura;
  private Float umidade;
  private Integer placarC;
  private Integer placarV;
}
