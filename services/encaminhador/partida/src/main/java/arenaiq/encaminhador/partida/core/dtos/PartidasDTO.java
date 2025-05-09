package arenaiq.encaminhador.partida.core.dtos;

import arenaiq.encaminhador.partida.core.models.enums.EClima;
import lombok.Data;

@Data
public class PartidasDTO {
  private String id;
  private EClima clima;
  private Float temperatura;
  private Float umidade;
  private Integer placarC;
  private Integer placarV;
}
